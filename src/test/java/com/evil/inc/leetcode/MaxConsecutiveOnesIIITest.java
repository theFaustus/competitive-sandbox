package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

    @Test
    void longestOnes() {
        MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
        Assertions.assertThat(maxConsecutiveOnesIII.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2)).isEqualTo(6);
        Assertions.assertThat(maxConsecutiveOnesIII.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3)).isEqualTo(10);
    }
}
