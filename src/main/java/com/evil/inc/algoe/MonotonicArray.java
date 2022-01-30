package com.evil.inc.algoe;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        if(array.length == 0 || array.length == 1) return true;
        boolean monotonicIncrease = false;
        boolean monotonicDecrease = false;
        int previousEl = array[0];
        int currentEl = 0;
        for (int el : array) {
            currentEl = el;
            if (currentEl == previousEl)
                continue;
            if (currentEl > previousEl)
                monotonicIncrease = true;
            if (currentEl < previousEl)
                monotonicDecrease = true;
            if (monotonicIncrease && currentEl <= previousEl)
                return false;
            if (monotonicDecrease && currentEl >= previousEl)
                return false;
            previousEl = currentEl;
        }
        return true;
    }
}
