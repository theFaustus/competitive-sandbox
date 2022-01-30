package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SmallestDifferenceTest {

    @Test
    public void smallestDifference() {
        Assertions.assertThat(SmallestDifference.smallestDifference(
                new int[]{-1, 5, 10, 20, 28, 3}, new int[]{26, 134, 135, 15, 17})).isEqualTo(new int[]{28, 26});
        Assertions.assertThat(SmallestDifference.smallestDifference(
                new int[]{-1, 5, 10, 20, 3}, new int[]{26, 134, 135, 15, 17})).isEqualTo(new int[]{20, 17});
    }
}
