package com.evil.inc;

import java.util.Locale;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder stringBuilder = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append("(");
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j) && i != j){
                    stringBuilder.replace(j, j + 1, ")");
                }
            }
        }
        return stringBuilder.toString();
    }
}
