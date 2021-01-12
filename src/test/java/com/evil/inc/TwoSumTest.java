package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {
        Assertions.assertThat(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
        Assertions.assertThat(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(new TwoSum().twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }
}