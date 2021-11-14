package com.evil.inc.algoexpert;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RunLengthEncoderTest {

    @Test
    public void runLengthEncoding() {
        var input = "AAAAAAAAAAAAABBCCCCDD";
        var expected = "9A4A2B4C2D";
        assertThat(RunLengthEncoder.runLengthEncoding(input)).isEqualTo(expected);
    }

    @Test
    public void runLengthEncoding2() {
        var input = "aA";
        var expected = "1a1A";
        assertThat(RunLengthEncoder.runLengthEncoding(input)).isEqualTo(expected);
    }
}