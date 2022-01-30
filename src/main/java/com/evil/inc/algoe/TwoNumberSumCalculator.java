package com.evil.inc.algoe;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSumCalculator {
    //O(n) time / O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> visitedNumbers = new HashSet<>();
        for (final int currentNumber : array) {
            int potentialMatch = targetSum - currentNumber;

            if (visitedNumbers.contains(potentialMatch)) {
                return new int[]{potentialMatch, currentNumber};
            } else {
                visitedNumbers.add(currentNumber);
            }
        }

        return new int[0];
    }
}
