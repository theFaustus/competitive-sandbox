package com.evil.inc.leetcode;

public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            String value = s1[i];
            for (int j = value.length() - 1; j >= 0; j--) {
                res.append(value.charAt(j));
            }
            if (i != s1.length - 1)
                res.append(" ");
        }

        return res.toString();
    }
}
