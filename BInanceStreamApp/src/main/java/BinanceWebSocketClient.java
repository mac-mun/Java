package com.example.binance.client;

import com.example.binance.handler.MessageHandler;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * WebSocket client for connecting to Binance streams.
 * Handles connection management and message processing.
 */
public class BinanceWebSocketClient {
    private static final Logger logger = LoggerFactory.getLogger(BinanceWebSocketClient.class);
    private static final String BASE_URL = "wss://stream.binance.com:9443/ws/";

    private WebSocketClient webSocketClient;
    private final ObjectMapper objectMapper;
    private final MessageHandler messageHandler;
    private volatile boolean connected = false;
    private final CountDownLatch connectionLatch = new CountDownLatch(1);

    public BinanceWebSocketClient() {
        this.objectMapper = new ObjectMapper();
        this.messageHandler = new MessageHandler();
    }

    /**
     * Connect to Binance WebSocket with specified streams.
     *
     * @param streams List of stream names to subscribe to
     * @throws Exception if connection fails
     */
    public void connect(List<String> streams) throws Exception {
        if (streams == null || streams.isEmpty()) {
            throw new IllegalArgumentException("At least one stream must be specified");
        }

        // Create stream URL
        String streamNames = String.join("/", streams);
        String url = BASE_URL + streamNames;

        logger.info("Connecting to: {}", url);

        URI serverUri = new URI(url);

        webSocketClient = new WebSocketClient(serverUri) {
            @Override
            public void onOpen(ServerHandshake handshake) {
                logger.info("Connected successfully to {} streams", streams.size());
                connected = true;
                connectionLatch.countDown();
            }

            @Override
            public void onMessage(String message) {
                try {
                    JsonNode data = objectMapper.readTree(message);
                    messageHandler.handleMessage(data);
                } catch (Exception e) {
                    logger.error("Failed to parse message: {}", e.getMessage());
                }
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                logger.info("WebSocket connection closed: {} - {}", code, reason);
                connected = false;
            }

            @Override
            public void onError(Exception ex) {
                logger.error("WebSocket error: {}", ex.getMessage(), ex);
                connected = false;
                connectionLatch.countDown();
            }
        };

        // Connect and wait for connection to be established
        webSocketClient.connect();

        // Wait for connection with timeout
        if (!connectionLatch.await(10, TimeUnit.SECONDS)) {
            throw new Exception("Connection timeout after 10 seconds");
        }

        if (!connected) {
            throw new Exception("Failed to establish WebSocket connection");
        }
    }

    /**
     * Check if the WebSocket is currently connected.
     *
     * @return true if connected, false otherwise
     */
    public boolean isConnected() {
        return connected && webSocketClient != null && webSocketClient.isOpen();
    }

    /**
     * Close the WebSocket connection.
     */
    public void close() {
        if (webSocketClient != null && webSocketClient.isOpen()) {
            webSocketClient.close();
            logger.info("WebSocket connection closed");
        }
        connected = false;
    }
}

