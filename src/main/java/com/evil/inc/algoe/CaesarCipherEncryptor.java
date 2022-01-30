package com.evil.inc.algoe;

public class CaesarCipherEncryptor {
    /**
     * Caesar Cipher Encryptor
     * Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
     * <p>
     * Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.
     * <p>
     * Sample Input
     * string = "xyz"
     * key = 2
     * Sample Output
     * "zab"
     */
    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        final int adjustedKey = key % 26;
        str.chars().forEach(c -> {
            final int shifterLetter = c + adjustedKey;
            if (shifterLetter <= 122) {
                stringBuilder.append((char) shifterLetter);
            } else {
                stringBuilder.append((char) (96 + shifterLetter % 122));
            }
        });
        return stringBuilder.toString();
    }

}
