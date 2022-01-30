package com.evil.inc.algoe;

public class BinarySearch {
    // O(log(n)) time | O(1) space
    public static int binarySearch(int[] array, int target) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int middlePointer = 0;
        while (leftPointer <= rightPointer) {
            middlePointer = (leftPointer + rightPointer) / 2;
            if (array[middlePointer] < target) {
                leftPointer = middlePointer + 1;
            } else if (array[middlePointer] > target) {
                rightPointer = middlePointer - 1;
            } else {
                break;
            }
        }
        return array[middlePointer] == target ? middlePointer : -1;
    }

    public static int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    // O(log(n)) time | O(log(n)) space
    public static int binarySearchRec(int[] array, int target, int left, int right) {
        if(left > right) return -1;
        int middle = (left + right) / 2;
        if(array[middle] == target){
            return middle;
        } else if(array[middle] > target){
            return binarySearchRec(array, target, left, middle - 1);
        } else
            return binarySearchRec(array, target, middle + 1, right);
    }
}
