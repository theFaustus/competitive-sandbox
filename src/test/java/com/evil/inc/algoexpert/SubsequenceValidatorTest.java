package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SubsequenceValidatorTest {

    @Test
    public void isValidSubsequence() {
        Assertions.assertThat(SubsequenceValidator.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
                                                                      Arrays.asList(1, 6, -1, 10))).isTrue();

        Assertions.assertThat(SubsequenceValidator.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
                                                                      Arrays.asList(1, 6, -1, -1))).isFalse();

        Assertions.assertThat(SubsequenceValidator.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
                                                                      Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10))).isFalse();

        Assertions.assertThat(SubsequenceValidator.isValidSubsequence(Arrays.asList(1, 1, 1, 1, 1),
                                                                      Arrays.asList(1, 1, 1))).isTrue();

    }
}