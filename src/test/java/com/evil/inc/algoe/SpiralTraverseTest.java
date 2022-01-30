package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class SpiralTraverseTest {

    @Test
    public void spiralTraverse() {
        var input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        var actual = SpiralTraverse.spiralTraverse(input);
        Assertions.assertThat(actual).isEqualTo(expected);

        var input2 =
                new int[][] {
                        {1, 2, 3, 4},
                        {10, 11, 12, 5},
                        {9, 8, 7, 6}
        };
        var expected2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        var actual2 = SpiralTraverse.spiralTraverse(input2);
        Assertions.assertThat(actual2).isEqualTo(expected2);

    }
}
