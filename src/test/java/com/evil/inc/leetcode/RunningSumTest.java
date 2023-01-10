package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunningSumTest {

    @Test
    public void solve() {
        RunningSum runningSum = new RunningSum();
        Assertions.assertThat(runningSum.solve(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
        Assertions.assertThat(runningSum.solve(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        Assertions.assertThat(runningSum.solve(new int[]{3, 1, 2, 10, 1})).isEqualTo(new int[]{3, 4, 6, 16, 17});
    }
}
