package com.evil.inc.algoe;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(j, j - 1, array);
                j--;
            }
        }

        return array;
    }

    private static void swap(final int j, final int i, final int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
