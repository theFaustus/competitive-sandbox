package com.evil.inc.algoexpert;

public class FindThreeLargestNumbers {
    /**
     * Write a function that takes in an array of at least three integers and, without sorting the input array, returns a sorted array of the three largest integers in the input array.
     * <p>
     * The function should return duplicate integers if necessary; for example, it should return [10, 10, 12] for an input array of [10, 5, 9, 10, 12].
     * <p>
     * Sample Input
     * array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
     * Sample Output
     * [18, 141, 541]
     */
    //  // O(n) time | O(1) space
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result[2]) {
                result[0] = result[1];
                result[1] = result[2];
                result[2] = array[i];
            } else if (array[i] > result[1]) {
                result[0] = result[1];
                result[1] = array[i];
            } else if (array[i] > result[0]) {
                result[0] = array[i];
            }
        }
        return result;
    }

}
