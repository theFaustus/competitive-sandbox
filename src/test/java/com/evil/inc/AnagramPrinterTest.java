package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramPrinterTest {

    @Test
    public void isAnagram() {
        Assertions.assertThat(AnagramPrinter.isAnagram("hello", "Hello")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagram("act", "cat")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagram("acts", "cat")).isFalse();
    }

    @Test
    public void isAnagramUsingArray() {
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArray("hello", "Hello")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArray("act", "cat")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArray("acts", "cat")).isFalse();
    }

    @Test
    public void isAnagramUsingArrays() {
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArrays("hello", "Hello")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArrays("act", "cat")).isTrue();
        Assertions.assertThat(AnagramPrinter.isAnagramUsingArrays("acts", "cat")).isFalse();
    }
}