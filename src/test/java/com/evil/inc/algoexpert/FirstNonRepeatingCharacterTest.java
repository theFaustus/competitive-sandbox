package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNonRepeatingCharacterTest {

    @Test
    public void firstNonRepeatingCharacter() {
        String input = "abcdcaf";
        int expected = 1;
        Assertions.assertThat(FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input)).isEqualTo(expected);
    }
}