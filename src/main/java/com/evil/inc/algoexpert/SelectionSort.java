package com.evil.inc.algoexpert;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int currentIndex = 0;
        while (currentIndex < array.length - 1) {
        int smallestIndex = currentIndex;
            for (int i = currentIndex + 1; i < array.length; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            swap(currentIndex, smallestIndex, array);
            currentIndex++;
        }

        return array;
    }

    private static void swap(final int j, final int i, final int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
