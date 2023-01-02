package com.evil.inc.algods;

import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 78, 2, 3, 54, -1, 7, 4, 3, 5};
        int[] arr2 = {1, 8, 2, 78, 2, 3, 54, -1, 7, 4, 3, 5};
        int[] arr3 = {1, 81, -2, -78, 2, 3, 54, -1, 7, 4, 3, 5};
        int[] arr4 = {1, 8, 2, 78, 22, 3, 3, 3, 3, 54, -1, 7, 4, 3, 5};

        quicksort(arr, 0, arr.length - 1);
        quicksort(arr2, 0, arr2.length - 1);
        quicksort(arr3, 0, arr3.length - 1);
//        quicksort(arr4, 0, arr4.length - 1);
        bubbleSort(arr4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.binarySearch(arr, 3));
    }

    public static void quicksort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex)
            return;
        int pivot = array[(leftIndex + rightIndex) / 2];
        int partitionIndex = partition(array, leftIndex, rightIndex, pivot);
        quicksort(array, leftIndex, partitionIndex - 1);
        quicksort(array, partitionIndex, rightIndex);
    }

    public static int binarySearch(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == n) {
                return mid;
            }
            if (n > array[mid]) {
                left = mid + 1;
            }
            if (n < array[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int partition(int[] array, int leftIndex, int rightIndex, int pivot) {
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
