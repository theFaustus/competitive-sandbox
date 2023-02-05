package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {

    @Test
    void runningSum() {
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        Assertions.assertThat(runningSumOf1dArray.runningSum(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
        Assertions.assertThat(runningSumOf1dArray.runningSum(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }
}
