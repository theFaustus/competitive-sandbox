package com.evil.inc;

import java.util.Set;

public class UniqueNumberKata {
    /**
     * There is an array with some numbers. All numbers are equal except for one. Try to find it!
     * <p>
     * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
     * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
     * It’s guaranteed that array contains at least 3 numbers.
     * <p>
     * The tests contain some very huge arrays, so think about performance.
     */
    public static double findUniq(double[] arr) {
        double currentNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //0 1 0
            if(i == 1 && Double.compare(currentNumber,arr[i]) != 0 && Double.compare(currentNumber,arr[i + 1]) != 0){
                return currentNumber;
            }
            if(Double.compare(currentNumber,arr[i]) != 0){
                return arr[i];
            }
            currentNumber = arr[i];
        }
        return arr[0];
    }
}
