package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerReverserTest {

    @Test
    public void reverse() {
        Assertions.assertThat(new IntegerReverser().reverse(-123)).isEqualTo(-321);
        Assertions.assertThat(new IntegerReverser().reverse(9646324)).isEqualTo(4236469);
        Assertions.assertThat(new IntegerReverser().reverse(1534236469)).isEqualTo(0);
    }
}