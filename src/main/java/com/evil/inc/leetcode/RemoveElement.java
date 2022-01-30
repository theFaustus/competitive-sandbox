package com.evil.inc.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int numberOfPermutations = 1;
        int lastIndex = nums.length - 1;
        for (int j = 0; j < nums.length && lastIndex > j; j++) {
            if(nums[j] == val){
                swap(nums, lastIndex, j);
                lastIndex--;
                numberOfPermutations++;
            }
        }
        return nums.length - numberOfPermutations;
    }

    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    private static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
