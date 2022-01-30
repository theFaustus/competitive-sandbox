package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    @Test
    public void isMonotonic() {
        var array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        var array2 = new int[] {1, 2, 0};
        var array3 = new int[] {-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -7, -9, -10, -11};
        Assertions.assertThat(MonotonicArray.isMonotonic(array)).isTrue();
        Assertions.assertThat(MonotonicArray.isMonotonic(array2)).isFalse();
        Assertions.assertThat(MonotonicArray.isMonotonic(array3)).isFalse();
    }
}
