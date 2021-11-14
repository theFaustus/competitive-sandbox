package com.evil.inc.algoexpert;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    /**
     * First Non-Repeating Character
     * Write a function that takes in a string of lowercase English-alphabet letters and returns the index of the string's first non-repeating character.
     * <p>
     * The first non-repeating character is the first character in a string that occurs only once.
     * <p>
     * If the input string doesn't have any non-repeating characters, your function should return -1.
     * <p>
     * Sample Input
     * string = "abcdcaf"
     * Sample Output
     * 1 // The first non-repeating character is "b" and is found at index 1.
     */
    public static int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> characterFrequency = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            characterFrequency.merge(string.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < string.length(); i++) {
            if (characterFrequency.get(string.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
