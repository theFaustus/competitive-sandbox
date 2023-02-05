package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MinimumValueGetPositiveStepByStepSumTest {

    @Test
    void solve() {
        MinimumValueGetPositiveStepByStepSum minimumValueGetPositiveStepByStepSum = new MinimumValueGetPositiveStepByStepSum();
        Assertions.assertThat(minimumValueGetPositiveStepByStepSum.solve(new int[]{-3, 2, -3, 4, 2})).isEqualTo(5);
        Assertions.assertThat(minimumValueGetPositiveStepByStepSum.solve(new int[]{1, 2})).isEqualTo(1);
        Assertions.assertThat(minimumValueGetPositiveStepByStepSum.solve(new int[]{1, -2, -3})).isEqualTo(5);
        Assertions.assertThat(minimumValueGetPositiveStepByStepSum.solve(new int[]{-3, 6, 2, 5, 8, 6})).isEqualTo(4);
        Assertions.assertThat(minimumValueGetPositiveStepByStepSum.solve(new int[]{2, 3, 5, -5, -1})).isEqualTo(1);
    }
}
