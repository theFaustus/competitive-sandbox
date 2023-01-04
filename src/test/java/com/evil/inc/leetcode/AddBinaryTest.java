package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void solve() {
        AddBinary addBinary = new AddBinary();
        Assertions.assertThat(addBinary.solve("11", "1")).isEqualTo("100");
        Assertions.assertThat(addBinary.solve("1010", "1011")).isEqualTo("10101");
        Assertions.assertThat(addBinary.solve("0", "0")).isEqualTo("0");
        Assertions.assertThat(addBinary.solve("1111", "1111")).isEqualTo("11110");
        Assertions.assertThat(addBinary.solve("100", "110010")).isEqualTo("110110");

    }

    @Test
    public void solve2() {
        AddBinary addBinary = new AddBinary();
        Assertions.assertThat(addBinary.solve2("11", "1")).isEqualTo("100");
        Assertions.assertThat(addBinary.solve2("1010", "1011")).isEqualTo("10101");
        Assertions.assertThat(addBinary.solve2("0", "0")).isEqualTo("0");
        Assertions.assertThat(addBinary.solve2("1111", "1111")).isEqualTo("11110");
        Assertions.assertThat(addBinary.solve2("100", "110010")).isEqualTo("110110");

    }
}
