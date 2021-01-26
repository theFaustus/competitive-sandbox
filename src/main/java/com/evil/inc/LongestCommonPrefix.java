package com.evil.inc;

public class LongestCommonPrefix {

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lower-case English letters.
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (i + 1 < strs.length && j < strs[i + 1].length() && strs[i].charAt(j) == strs[i + 1].charAt(j))
                    stringBuilder.append(strs[i].charAt(j));
                else
                    break;
            }
            if (i + 1 < strs.length) {
                strs[i + 1] = stringBuilder.toString();
                stringBuilder = new StringBuilder();
            }
        }
        return strs[strs.length - 1];
    }
}
