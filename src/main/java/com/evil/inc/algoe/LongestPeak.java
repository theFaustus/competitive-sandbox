package com.evil.inc.algoe;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        int i = 1;
        int longestPeak = 0;
        boolean highestPeak = false;
        while (i < array.length - 1){
            if(array[i - 1] < array[i] && array[i + 1] < array[i]){
                highestPeak = true;
            }
            if(!highestPeak) {
                i++;
                continue;
            }
            int leftIdx = i - 2;
            int rightIdx = i + 2;

            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]){
                leftIdx--;
            }

            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]){
                rightIdx++;
            }

            int currentPeakLength = rightIdx - leftIdx - 1;
            if(currentPeakLength > longestPeak){
                longestPeak = currentPeakLength;
            }
            i = rightIdx;

        }

        return longestPeak;
    }
}
