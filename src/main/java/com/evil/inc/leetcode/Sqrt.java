package com.evil.inc.leetcode;

public class Sqrt {
    public int solve(int x) {
        if (x < 2) return x;
        int leftPointer = 2;
        int rightPointer = x / 2;
        int middlePointer = 2;
        long num;
        while (leftPointer <= rightPointer) {
            middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
            num = (long) middlePointer * middlePointer;
            if (num < x) {
                leftPointer = middlePointer + 1;
            } else if (num > x) {
                rightPointer = middlePointer - 1;
            } else {
                return middlePointer;
            }
        }
        return rightPointer;
    }
}
