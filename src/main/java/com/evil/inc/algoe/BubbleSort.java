package com.evil.inc.algoe;

public class BubbleSort {
    /**
     * Bubble Sort
     * Write a function that takes in an array of integers and returns a sorted version of that array. Use the Bubble Sort algorithm to sort the array.
     * <p>
     * If you're unfamiliar with Bubble Sort, we recommend watching the Conceptual Overview section of this question's video explanation before starting to code.
     * <p>
     * Sample Input
     * array = [8, 5, 2, 9, 5, 6, 3]
     * Sample Output
     * [2, 3, 5, 5, 6, 8, 9]
     */
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int lockedIndex = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0, j = 1; i < lockedIndex; i++, j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            lockedIndex--;
        }
        return array;
    }

}
