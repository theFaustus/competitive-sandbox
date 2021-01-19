package com.evil.inc;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsCheckerCSDojo {
    //if arrays are sorted we can increment position based on the value that we are currently iterating in both arrays
    public static Integer[] findCommonElements(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] == secondArray[j]) {
                commonElements.add(firstArray[i]);
                i++;
                j++;
            } else if(firstArray[i] > secondArray[j]){
                j++;
            } else {
                i++;
            }
        }
        return commonElements.toArray(new Integer[0]);
    }
}
