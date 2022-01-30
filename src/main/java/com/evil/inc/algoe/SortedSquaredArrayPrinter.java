package com.evil.inc.algoe;

public class SortedSquaredArrayPrinter {
    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        int left = 0;
        int right = result.length - 1;
        for (int i = result.length - 1; i >= 0; i--) {
            if (Math.abs(array[left]) >= Math.abs(array[right])) {
                result[i] = (int) Math.pow(array[left++], 2);
            } else {
                result[i] = (int) Math.pow(array[right--], 2);
            }
        }
        return result;
    }
}
