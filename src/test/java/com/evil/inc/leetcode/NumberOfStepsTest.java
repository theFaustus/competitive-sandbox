package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStepsTest {

    @Test
    public void solve() {
        NumberOfSteps numberOfSteps = new NumberOfSteps();
        Assertions.assertThat(numberOfSteps.solve(14)).isEqualTo(6);
        Assertions.assertThat(numberOfSteps.solve(8)).isEqualTo(4);
        Assertions.assertThat(numberOfSteps.solve(123)).isEqualTo(12);
    }
}
