package com.evil.inc.leetcode;

public class AddBinary {
    public String solve(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int remainder = 0;
        while (i >= 0 || j >= 0) {
            int sum = remainder;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            remainder = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }
        if (remainder != 0) result.append(remainder);
        return result.reverse().toString();
    }

    public String solve2(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}
