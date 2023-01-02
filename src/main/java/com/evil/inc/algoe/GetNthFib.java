package com.evil.inc.algoe;

import java.util.Arrays;
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

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
        System.out.println(reverse("123456789"));
        System.out.println(inPlaceReverse("123456789"));
    }

    public static String inPlaceReverse(final String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0, j = result.length() - 1; i < s.length() / 2; i++, j--) {
            result.setCharAt(i, s.charAt(j));
            result.setCharAt(j, s.charAt(i));
        }
        return result.toString();
    }

    public static String reverse(final String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    private static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial(int n) {
        if (n <= 2)
            return n;
        return n * factorial(n - 1);
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

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

}
