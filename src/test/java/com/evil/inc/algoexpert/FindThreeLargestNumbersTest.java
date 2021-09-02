package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindThreeLargestNumbersTest {

    @Test
    public void findThreeLargestNumbers() {
        int[] expected = {18, 141, 541};

        final int[] threeLargestNumbers = FindThreeLargestNumbers.findThreeLargestNumbers(
                new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7});
        System.out.println(Arrays.toString(threeLargestNumbers));
        Assertions.assertThat(compare(
                threeLargestNumbers,
                expected)).isTrue();
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


}