package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void solve() {
        PlusOne plusOne = new PlusOne();
        Assertions.assertThat(plusOne.solve(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        Assertions.assertThat(plusOne.solve(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2, 2});
        Assertions.assertThat(plusOne.solve(new int[]{9, 9, 9})).isEqualTo(new int[]{1, 0, 0, 0});
        Assertions.assertThat(plusOne.solve(new int[]{9})).isEqualTo(new int[]{1, 0});
        Assertions.assertThat(plusOne.solve(new int[]{4, 9, 9, 9})).isEqualTo(new int[]{5, 0, 0, 0});
    }

    @Test
    public void solve2() {
        PlusOne plusOne = new PlusOne();
        Assertions.assertThat(plusOne.solve2(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        Assertions.assertThat(plusOne.solve2(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2, 2});
        Assertions.assertThat(plusOne.solve2(new int[]{9, 9, 9})).isEqualTo(new int[]{1, 0, 0, 0});
        Assertions.assertThat(plusOne.solve2(new int[]{9})).isEqualTo(new int[]{1, 0});
        Assertions.assertThat(plusOne.solve2(new int[]{4, 9, 9, 9})).isEqualTo(new int[]{5, 0, 0, 0});
    }
}
