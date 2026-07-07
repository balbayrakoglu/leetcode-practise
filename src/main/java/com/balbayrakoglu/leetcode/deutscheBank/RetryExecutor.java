package com.balbayrakoglu.leetcode.deutscheBank;

import java.util.function.Supplier;

public class RetryExecutor {

    public static <T> T executeWithRetry(Supplier<T> supplier, int retries, Supplier<T> fallback) {
        int attemps = 0;
        while (attemps < retries) {
            try {
                return supplier.get();
            } catch (Exception e) {
                attemps++;
            }
        }
        return fallback.get();
    }
}
