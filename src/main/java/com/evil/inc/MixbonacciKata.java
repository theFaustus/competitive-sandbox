package com.evil.inc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MixbonacciKata {
    private static final List<Long> fibonacciSequence = new ArrayList<>();
    private static final List<Long> padovanSequence = new ArrayList<>();
    private static final List<Long> jacobsthalSequence = new ArrayList<>();
    private static final List<Long> pellSequence = new ArrayList<>();
    private static final List<Long> tribonacciSequence = new ArrayList<>();
    private static final List<Long> tetranacciSequence = new ArrayList<>();

    public static BigInteger[] solve(String[] pattern, int length) {
        for (int i = 0; i < length; i++) {
            fibonacciSequence.add(fibonacciNonRecursive(i));
        }
        for (int i = 0; i < length; i++) {
            padovanSequence.add(padovanNonRecursive(i));
        }
        for (int i = 0; i < length; i++) {
            jacobsthalSequence.add(jacobsthalNonRecursive(i));
        }
        for (int i = 0; i < length; i++) {
            pellSequence.add(pellNonRecursive(i));
        }
        for (int i = 0; i < length; i++) {
            tribonacciSequence.add(tribonacciNonRecursive(i));
        }
        for (int i = 0; i < length; i++) {
            tetranacciSequence.add(tetranacciNonRecursive(i));
        }

        Map<String, Integer> bonacciToCounts = new HashMap<>();
        bonacciToCounts.put("fib", 0);
        bonacciToCounts.put("pad", 0);
        bonacciToCounts.put("jac", 0);
        bonacciToCounts.put("pel", 0);
        bonacciToCounts.put("tri", 0);
        bonacciToCounts.put("tet", 0);

        ArrayList<BigInteger> bigIntegers = new ArrayList<>();
        if (pattern.length == 0 || length == 0) {
            return new BigInteger[0];
        } else {
            for (int i = 0, patternIndex = 0; i < length; i++, patternIndex++) {
                if (pattern[i % pattern.length].equals("fib")) {
                    bigIntegers.add(BigInteger.valueOf(fibonacciSequence.get(bonacciToCounts.get("fib"))));
                    bonacciToCounts.merge("fib", 1, Integer::sum);

                } else if (pattern[i % pattern.length].equals("pad")) {
                    bigIntegers.add(BigInteger.valueOf(padovanSequence.get(bonacciToCounts.get("pad"))));
                    bonacciToCounts.merge("pad", 1, Integer::sum);

                } else if (pattern[i % pattern.length].equals("jac")) {
                    bigIntegers.add(BigInteger.valueOf(jacobsthalSequence.get(bonacciToCounts.get("jac"))));
                    bonacciToCounts.merge("jac", 1, Integer::sum);

                } else if (pattern[i % pattern.length].equals("pel")) {
                    bigIntegers.add(BigInteger.valueOf(pellSequence.get(bonacciToCounts.get("pel"))));
                    bonacciToCounts.merge("pel", 1, Integer::sum);

                } else if (pattern[i % pattern.length].equals("tri")) {
                    bigIntegers.add(BigInteger.valueOf(tribonacciSequence.get(bonacciToCounts.get("tri"))));
                    bonacciToCounts.merge("tri", 1, Integer::sum);

                } else if (pattern[i % pattern.length].equals("tet")) {
                    bigIntegers.add(BigInteger.valueOf(tetranacciSequence.get(bonacciToCounts.get("tet"))));
                    bonacciToCounts.merge("tet", 1, Integer::sum);

                }
            }
        }

        return bigIntegers.toArray(new BigInteger[0]);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long padovan(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return 0;
        }
        return padovan(n - 2) + padovan(n - 3);
    }

    public static long jacobsthal(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return jacobsthal(n - 1) + (2 * jacobsthal(n - 2));
    }

    public static long pell(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (2 * pell(n - 1)) + pell(n - 2);
    }

    public static long tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static long tetranacci(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        return tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
    }


    public static long fibonacciNonRecursive(int n) {
        if (n < 2) {
            return n;
        }
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static long padovanNonRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return 0;
        }

        long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 0;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }
        return arr[n];

    }

    public static long jacobsthalNonRecursive(int n) {
        if (n < 2) {
            return n;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }
        return arr[n];
    }

    public static long pellNonRecursive(int n) {
        if (n < 2) {
            return n;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = 2 * arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static long tribonacciNonRecursive(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }

    public static long tetranacciNonRecursive(int n) {
        if (n < 3) {
            return 0;
        }

        if (n == 3) {
            return 1;
        }

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 1;

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4];
        }
        return arr[n];
    }

}
