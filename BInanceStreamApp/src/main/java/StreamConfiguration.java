package com.example.binance.config;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Configuration class for popular Binance WebSocket streams.
 */
public class StreamConfiguration {

    /**
     * Get a map of popular stream configurations.
     *
     * @return Map of configuration name to list of streams
     */
    public static Map<String, List<String>> getPopularStreams() {
        Map<String, List<String>> streams = new LinkedHashMap<>();

        streams.put("btc_ticker", Arrays.asList("btcusdt@ticker"));
        streams.put("eth_ticker", Arrays.asList("ethusdt@ticker"));
        streams.put("btc_trades", Arrays.asList("btcusdt@trade"));
        streams.put("btc_depth", Arrays.asList("btcusdt@depth5@1000ms"));
        streams.put("btc_kline_1m", Arrays.asList("btcusdt@kline_1m"));

        streams.put("top_crypto_tickers", Arrays.asList(
                "btcusdt@ticker",
                "ethusdt@ticker",
                "bnbusdt@ticker",
                "adausdt@ticker",
                "solusdt@ticker"
        ));

        streams.put("btc_multi", Arrays.asList(
                "btcusdt@ticker",
                "btcusdt@trade",
                "btcusdt@depth5@1000ms"
        ));

        streams.put("eth_complete", Arrays.asList(
                "ethusdt@ticker",
                "ethusdt@trade",
                "ethusdt@depth10@1000ms",
                "ethusdt@kline_1m"
        ));

        return streams;
    }
}

