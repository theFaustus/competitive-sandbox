package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class TandemBicycleTest {

    @Test
    public void tandemBicycle() {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;
        int expected = 32;
        var actual = new TandemBicycle().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}