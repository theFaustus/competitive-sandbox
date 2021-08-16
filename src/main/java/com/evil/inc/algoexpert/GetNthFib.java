package com.evil.inc.algoexpert;

import java.util.HashMap;

public class GetNthFib {

    public static int getNthFib(int n) {
        return fibonacci(n - 1);
    }

    public static int getNthFibMemoize(int n) {
        final HashMap<Integer, Integer> memoize = new HashMap<>();
        memoize.put(0, 0);
        memoize.put(1, 1);
        return fibonacciMemoize(memoize, n - 1);
    }

    // O(2^n) time | O(n) space
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // O(n) time | O(n) space
    public static int fibonacciMemoize(HashMap<Integer, Integer> memoize, int n) {
        if (memoize.containsKey(n)) {
            System.out.println(memoize);
            return memoize.get(n);
        } else {
            final int computedValue = fibonacciMemoize(memoize, n - 1) + fibonacciMemoize(memoize, n - 2);
            memoize.put(n, computedValue);
            return computedValue;
        }
    }

}
