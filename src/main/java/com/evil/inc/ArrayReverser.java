package com.evil.inc;

import java.util.Arrays;

public class ArrayReverser {
    public static int[] reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int endIndex = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[endIndex];
            arr[endIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
