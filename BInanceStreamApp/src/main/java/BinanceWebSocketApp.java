package com.example.binance;

import com.example.binance.client.BinanceWebSocketClient;
import com.example.binance.config.StreamConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Main application class for Binance WebSocket client.
 * Provides an interactive console interface to connect to various Binance streams.
 */
public class BinanceWebSocketApp {
    private static final Logger logger = LoggerFactory.getLogger(BinanceWebSocketApp.class);

    public static void main(String[] args) {
        System.out.println("\n Binance WebSocket Client (Java)");
        System.out.println("===================================\n");

        // Get available stream configurations
        Map<String, List<String>> popularStreams = StreamConfiguration.getPopularStreams();

        System.out.println("Available stream configurations:");
        int index = 1;
        for (Map.Entry<String, List<String>> entry : popularStreams.entrySet()) {
            System.out.printf("%d. %s: %s%n", index++, entry.getKey(), String.join(", ", entry.getValue()));
        }
        System.out.printf("%d. Custom streams (comma-separated)%n", index);

        Scanner scanner = new Scanner(System.in);
        List<String> selectedStreams;

        try {
            System.out.printf("\nSelect a configuration (1-%d): ", index);
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice >= 1 && choice <= popularStreams.size()) {
                String selectedConfig = (String) popularStreams.keySet().toArray()[choice - 1];
                selectedStreams = popularStreams.get(selectedConfig);
                System.out.printf("\nSelected: %s%n", selectedConfig);
            } else if (choice == index) {
                System.out.print("Enter custom streams (comma-separated): ");
                String customInput = scanner.nextLine();
                selectedStreams = Arrays.asList(customInput.split(","));
                selectedStreams.replaceAll(String::trim);
                selectedStreams.removeIf(String::isEmpty);

                if (selectedStreams.isEmpty()) {
                    System.out.println("No valid streams provided.");
                    return;
                }
            } else {
                System.out.println("Invalid choice.");
                return;
            }

        } catch (Exception e) {
            System.out.println("\nExiting...");
            return;
        }

        System.out.printf("\n📡 Connecting to streams: %s%n", String.join(", ", selectedStreams));
        System.out.println("Press Ctrl+C to stop\n");

        // Create and start the WebSocket client
        BinanceWebSocketClient client = new BinanceWebSocketClient();

        // Add shutdown hook for graceful cleanup
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Shutting down WebSocket client...");
            client.close();
        }));

        try {
            client.connect(selectedStreams);

            // Keep the main thread alive
            while (client.isConnected()) {
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            logger.info("Application interrupted");
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            logger.error("Application error: {}", e.getMessage(), e);
        } finally {
            client.close();
            System.out.println("\nGoodbye!");
        }
    }
}

