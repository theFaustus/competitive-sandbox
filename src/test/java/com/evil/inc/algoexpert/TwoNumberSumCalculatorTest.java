package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoNumberSumCalculatorTest {

    @Test
    public void twoNumberSum() {
        Assertions.assertThat(TwoNumberSumCalculator.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10))
                .isEqualTo(new int[]{11, -1});
    }
}