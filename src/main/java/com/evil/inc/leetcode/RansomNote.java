package com.evil.inc.leetcode;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            String letter = String.valueOf(ransomNote.charAt(i));
            if (magazine.contains(letter)){
                magazine = magazine.replaceFirst(letter, "");
            } else {
                return false;
            }
        }

        return true;
    }
}
