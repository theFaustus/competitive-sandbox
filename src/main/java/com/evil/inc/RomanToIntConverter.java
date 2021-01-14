package com.evil.inc;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntConverter {
    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "III"
     * Output: 3
     * <p>
     * Example 2:
     * <p>
     * Input: s = "IV"
     * Output: 4
     * <p>
     * Rules:
     * * If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
     * * If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
     * * If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900
     */
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()
                    && ((s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                    || (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                    || (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')))) {
                result += (getInt(s.charAt(i + 1)) - getInt(s.charAt(i)));
                i++;
            } else {
                result += getInt(s.charAt(i));
            }
        }

        return result;
    }

    private static int getInt(Character roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
