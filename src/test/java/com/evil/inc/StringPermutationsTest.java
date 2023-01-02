package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationsTest {

    @Test
    public void findNumberOfPermutationsFor() {

        Assertions.assertThat(StringPermutations.findNumberOfPermutationsFor("abbc", "cbabadcbbabbcbabaabccbabc")).isNotEmpty();
    }
}