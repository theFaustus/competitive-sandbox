package com.evil.inc;

import java.util.Arrays;

public class SubstringComparator {

    /**
     * We define the following terms:
     * <p>
     * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
     * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
     * <p>
     * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
     * Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
     * <p>
     * Input Format
     * <p>
     * The first line contains a string denoting .
     * The second line contains an integer denoting .
     * <p>
     * Constraints
     * <p>
     * consists of English alphabetic letters only (i.e., [a-zA-Z]).
     * <p>
     * Output Format
     * <p>
     * Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
     */
    public static String getSmallestAndLargest(String s, int k) {

        String[] substrings = new String[s.length() - k + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i >= k) {
                substrings[i] = s.substring(i, k + i);
                System.out.println(substrings[i]);
            }
        }

        for (int i = 0; i < substrings.length; i++) {
            for (int j = i + 1; j < substrings.length; j++) {
                if (substrings[i].compareTo(substrings[j]) > 0) {
                    String temp = substrings[i];
                    substrings[i] = substrings[j];
                    substrings[j] = temp;
                }
            }
        }

        return substrings[0] + "\n" + substrings[substrings.length - 1];
    }

    public static String getSmallestAndLargestCompareTo(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;

        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);

            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }
}
