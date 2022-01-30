package com.evil.inc.leetcode;

public class DetectCapital {
    public static boolean solve(String word) {
//        boolean allUppercase = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(
//                word.charAt(word.length() - 1));
//        boolean allLowercase = Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(
//                word.charAt(word.length() - 1));
//        boolean firstUppercase = Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(
//                word.charAt(word.length() - 1));
//        if(Character.isUpperCase(word.charAt(word.length() - 1)) && Character.isLowerCase(word.charAt(0))) return false;
//        for (int i = 0; i < word.length(); i++) {
//            if (allLowercase && Character.isUpperCase(word.charAt(i))) return false;
//            if (allUppercase && Character.isLowerCase(word.charAt(i))) return false;
//            if (firstUppercase && Character.isUpperCase(word.charAt(i == word.length() - 1 ? i : i + 1))) return false;
//        }
//        return true;

        return word.toLowerCase().equals(word)
                || word.toUpperCase().equals(word)
                || word.substring(1).toLowerCase().equals(word.substring(1));
    }
}
