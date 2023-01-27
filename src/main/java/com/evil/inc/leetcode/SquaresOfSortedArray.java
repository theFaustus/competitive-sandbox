package com.evil.inc.leetcode;

public class SquaresOfSortedArray {
    public int[] solve(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int resultIndex = nums.length - 1;
        while (left <= right) {
            int leftAbs = Math.abs(nums[left]);
            int rightAbs = Math.abs(nums[right]);
            if (leftAbs < rightAbs) {
                result[resultIndex] = rightAbs * rightAbs;
                right--;
            } else {
                result[resultIndex] = leftAbs * leftAbs;
                left++;
            }
            resultIndex--;
        }
        return result;
    }
}
