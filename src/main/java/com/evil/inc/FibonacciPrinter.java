package com.evil.inc;

import java.time.Duration;
import java.time.Instant;

public class FibonacciPrinter {
    public static void main(String[] args) {
        int n = 40;
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciRecursive(i));
        }

        Instant stopTime = Instant.now();
        System.out.println(Duration.between(startTime, stopTime));
        startTime = Instant.now();

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciIterative(i));
        }
        stopTime = Instant.now();
        System.out.println(Duration.between(startTime, stopTime));
        startTime = Instant.now();

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciMemoization(i, new int[i + 1]));
        }
        stopTime = Instant.now();
        System.out.println(Duration.between(startTime, stopTime));
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        int[] fibonacciNumbers = new int[n + 1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers[fibonacciNumbers.length - 1];
    }

    public static int fibonacciMemoization(int n, int[] memo) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        if (memo[n] == 0) {
            memo[n] = fibonacciMemoization(n - 1, memo) + fibonacciMemoization(n - 2, memo);
        }
        return memo[n];
    }

}
