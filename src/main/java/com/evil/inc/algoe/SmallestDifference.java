package com.evil.inc.algoe;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int[] result = new int[2];
        int distance = Integer.MAX_VALUE;
        int currentDistance = Integer.MAX_VALUE;
        while (firstArrayIndex < arrayOne.length && secondArrayIndex < arrayTwo.length) {
            final int firstNum = arrayOne[firstArrayIndex];
            final int secondNum = arrayTwo[secondArrayIndex];
            if (firstNum > secondNum) {
                currentDistance = firstNum - secondNum;
                secondArrayIndex++;
            } else if (secondNum > firstNum){
                currentDistance = secondNum - firstNum;
                firstArrayIndex++;
            } else {
                return new int[]{firstNum, secondNum};
            }
            if (currentDistance < distance){
                distance = currentDistance;
                result = new int[]{firstNum, secondNum};
            }
        }
        return result;
    }
}
