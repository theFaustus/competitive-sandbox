package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReverserTest {

    @Test
    public void reverse() {
        Assertions.assertThat(ArrayReverser.reverse(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{5, 4, 3, 2, 1});
        Assertions.assertThat(ArrayReverser.reverse(new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(new int[]{6, 5, 4, 3, 2, 1});
    }
}