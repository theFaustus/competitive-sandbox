package com.evil.inc;

public class Palindromer {
    /**
     * Given an integer x, return true if x is palindrome integer.
     * <p>
     * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 121
     * Output: true
     * Example 2:
     * <p>
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     */
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int initial = x;
        int revertedNumber = 0;
        while (x != 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return initial == revertedNumber;
    }
}
