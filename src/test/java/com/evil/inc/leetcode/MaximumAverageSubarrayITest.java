package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    @Test
    void findMaxAverage() {
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        Assertions.assertThat(maximumAverageSubarrayI.findMaxAverage(new int[]{5}, 1)).isEqualTo(5.00000);
        Assertions.assertThat(maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)).isEqualTo(12.75000);
    }
}
