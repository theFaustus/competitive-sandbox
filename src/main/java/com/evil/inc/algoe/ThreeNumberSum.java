package com.evil.inc.algoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    //O(n^2)
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int leftPointer = i + 1;
            int rightPointer = array.length - 1;
            while (leftPointer < rightPointer) {
                final int currentSum = array[i] + array[leftPointer] + array[rightPointer];
                if (currentSum == targetSum) {
                    result.add(new Integer[]{array[i], array[leftPointer], array[rightPointer]});
                    leftPointer++;
                    rightPointer--;
                } else if (currentSum < targetSum) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        result.forEach(a -> System.out.println(Arrays.toString(a)));
        return result;
    }
}
