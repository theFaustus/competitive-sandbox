package com.evil.inc;

import java.util.Arrays;
import java.util.BitSet;

public class PangramCheckerKata {
    /**
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     * <p>
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     */
    public boolean check(String sentence) {
        char[] alphabetChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String s = sentence.toLowerCase();
        for (char alphabetChar : alphabetChars) {
            if (!s.contains(alphabetChar + ""))
                return false;
        }

        return true;
    }

    public boolean checkUsingStream(String sentence) {
        //clever use of distinct
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

    public boolean checkUsingCharIteration(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
}
