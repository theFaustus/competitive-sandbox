package com.evil.inc.algoe;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean isPalindrome2(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString().equals(str);
    }
}
