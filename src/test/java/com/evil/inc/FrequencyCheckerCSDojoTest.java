package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyCheckerCSDojoTest {

    @Test
    public void findMostFrequentElement() {
        Assertions.assertThat(FrequencyCheckerCSDojo.findMostFrequentElement(new int[]{1, 3, 1, 3, 2, 1}))
                .isEqualTo(1);
        Assertions.assertThat(FrequencyCheckerCSDojo.findMostFrequentElement(new int[]{1, 3, 1, 3, 2, 1, 3, 3, 3, 1, 4}))
                .isEqualTo(3);
    }

    @Test
    public void findMostFrequentElementOptimized() {
        Assertions.assertThat(FrequencyCheckerCSDojo.findMostFrequentElementOptimized(new int[]{1, 3, 1, 3, 2, 1}))
                .isEqualTo(1);
        Assertions.assertThat(FrequencyCheckerCSDojo.findMostFrequentElementOptimized(new int[]{1, 3, 1, 3, 2, 1, 3, 3, 3, 1, 4}))
                .isEqualTo(3);
    }
}