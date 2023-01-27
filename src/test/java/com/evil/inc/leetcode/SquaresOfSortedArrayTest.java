package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresOfSortedArrayTest {

    @Test
    public void solve() {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        Assertions.assertThat(squaresOfSortedArray.solve(new int[]{-5, -3, -2, -1})).isEqualTo(new int[]{1, 4, 9, 25});
        Assertions.assertThat(squaresOfSortedArray.solve(new int[]{-7, -3, 2, 3, 11})).isEqualTo(new int[]{4, 9, 9, 49, 121});
        Assertions.assertThat(squaresOfSortedArray.solve(new int[]{-4, -1, 0, 3, 10})).isEqualTo(new int[]{0, 1, 9, 16, 100});
    }
}
