package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPeakTest {

    @Test
    public void longestPeak() {
        var input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        var expected = 6;
        var actual = LongestPeak.longestPeak(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
