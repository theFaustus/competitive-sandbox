package com.evil.inc.leetcode;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int numberOfUniqueNumbers = 1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
                numberOfUniqueNumbers++;
            }
        }
        return numberOfUniqueNumbers;
    }


}
