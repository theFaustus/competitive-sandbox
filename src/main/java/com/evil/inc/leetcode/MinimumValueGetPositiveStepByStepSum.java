package com.evil.inc.leetcode;

public class MinimumValueGetPositiveStepByStepSum {
    public int solve(int[] nums) {
        int total = 0;
        int minVal = 0;
        for (int num : nums) {
            total += num;
            minVal = Math.min(minVal, total);
        }
        return Math.abs(minVal) + 1;
    }
}
