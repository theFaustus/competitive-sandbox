package com.evil.inc;

import java.util.Locale;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder stringBuilder = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            stringBuilder.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return stringBuilder.toString();
    }
}
