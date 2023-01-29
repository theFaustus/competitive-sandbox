package com.evil.inc.leetcode;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int numberOfZeros = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) numberOfZeros++;
            if (numberOfZeros > k) {
                if (nums[left] == 0)
                    numberOfZeros--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
