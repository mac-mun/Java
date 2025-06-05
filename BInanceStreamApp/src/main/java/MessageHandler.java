package com.example.binance.handler;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Handles different types of messages received from Binance WebSocket streams.
 */
public class MessageHandler {
    private static final Logger logger = LoggerFactory.getLogger(MessageHandler.class);
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * Handle incoming WebSocket messages.
     *
     * @param data Parsed JSON message from WebSocket
     */
    public void handleMessage(JsonNode data) {
        try {
            String stream = data.has("stream") ? data.get("stream").asText() : "unknown";
            JsonNode eventData = data.has("data") ? data.get("data") : data;

            String eventType = eventData.has("e") ? eventData.get("e").asText() : null;

            switch (eventType) {
                case "24hrTicker":
                    handleTicker(eventData);
                    break;
                case "depthUpdate":
                    handleDepthUpdate(eventData);
                    break;
                case "trade":
                    handleTrade(eventData);
                    break;
                case "kline":
                    handleKline(eventData);
                    break;
                default:
                    handleGeneric(stream, eventData, eventType);
                    break;
            }
        } catch (Exception e) {
            logger.error("Error handling message: {}", e.getMessage());
        }
    }

    /**
     * Handle 24hr ticker statistics.
     */
    private void handleTicker(JsonNode data) {
        String symbol = data.has("s") ? data.get("s").asText() : "N/A";
        double price = data.has("c") ? data.get("c").asDouble() : 0.0;
        double change = data.has("P") ? data.get("P").asDouble() : 0.0;
        double volume = data.has("v") ? data.get("v").asDouble() : 0.0;

        String changeColor = change >= 0 ? "📈" : "📉";
        System.out.printf("%s [%s] 📊 TICKER %s: Price=$%.4f Change=%+.2f%% Volume=%.2f%n",
                getCurrentTime(), changeColor, symbol, price, change, volume);
    }

    /**
     * Handle order book depth updates.
     */
    private void handleDepthUpdate(JsonNode data) {
        String symbol = data.has("s") ? data.get("s").asText() : "N/A";
        JsonNode bids = data.get("b");
        JsonNode asks = data.get("a");

        if (bids != null && bids.isArray() && bids.size() > 0 &&
                asks != null && asks.isArray() && asks.size() > 0) {

            double bestBid = bids.get(0).get(0).asDouble();
            double bestAsk = asks.get(0).get(0).asDouble();
            double spread = bestAsk - bestBid;

            System.out.printf("%s [📖] DEPTH %s: Bid=$%.4f Ask=$%.4f Spread=$%.4f%n",
                    getCurrentTime(), symbol, bestBid, bestAsk, spread);
        }
    }

    /**
     * Handle individual trade data.
     */
    private void handleTrade(JsonNode data) {
        String symbol = data.has("s") ? data.get("s").asText() : "N/A";
        double price = data.has("p") ? data.get("p").asDouble() : 0.0;
        double quantity = data.has("q") ? data.get("q").asDouble() : 0.0;
        boolean isBuyerMaker = data.has("m") && data.get("m").asBoolean();
        String side = isBuyerMaker ? "SELL" : "BUY";
        String sideEmoji = isBuyerMaker ? "🔴" : "🟢";

        System.out.printf("%s [%s] 💹 TRADE %s: %s %.6f @ $%.4f%n",
                getCurrentTime(), sideEmoji, symbol, side, quantity, price);
    }

    /**
     * Handle kline/candlestick data.
     */
    private void handleKline(JsonNode data) {
        JsonNode kline = data.get("k");
        if (kline == null) return;

        String symbol = kline.has("s") ? kline.get("s").asText() : "N/A";
        String interval = kline.has("i") ? kline.get("i").asText() : "N/A";
        double openPrice = kline.has("o") ? kline.get("o").asDouble() : 0.0;
        double closePrice = kline.has("c") ? kline.get("c").asDouble() : 0.0;
        double highPrice = kline.has("h") ? kline.get("h").asDouble() : 0.0;
        double lowPrice = kline.has("l") ? kline.get("l").asDouble() : 0.0;
        double volume = kline.has("v") ? kline.get("v").asDouble() : 0.0;
        boolean isClosed = kline.has("x") && kline.get("x").asBoolean();

        String status = isClosed ? "CLOSED" : "OPEN";
        String statusEmoji = isClosed ? "🔒" : "🔓";
        String trendEmoji = closePrice >= openPrice ? "📈" : "📉";

        System.out.printf("%s [%s%s] 🕯️ KLINE %s %s: O=$%.4f H=$%.4f L=$%.4f C=$%.4f V=%.2f [%s]%n",
                getCurrentTime(), statusEmoji, trendEmoji, symbol, interval,
                openPrice, highPrice, lowPrice, closePrice, volume, status);
    }

    /**
     * Handle generic events that don't have specific handlers.
     */
    private void handleGeneric(String stream, JsonNode eventData, String eventType) {
        String symbol = eventData.has("s") ? eventData.get("s").asText() : "N/A";
        long timestamp = eventData.has("E") ? eventData.get("E").asLong() : 0;

        LocalDateTime eventTime = timestamp > 0 ?
                LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()) :
                LocalDateTime.now();

        System.out.printf("%s [ℹ️] %s %s - %s at %s%n",
                getCurrentTime(), stream, symbol, eventType, eventTime.format(TIME_FORMATTER));
    }

    /**
     * Get current time formatted as string.
     */
    private String getCurrentTime() {
        return LocalDateTime.now().format(TIME_FORMATTER);
    }
}

