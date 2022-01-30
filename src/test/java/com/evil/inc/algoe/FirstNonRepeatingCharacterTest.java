package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FirstNonRepeatingCharacterTest {

    @Test
    public void firstNonRepeatingCharacter() {
        String input = "abcdcaf";
        int expected = 1;
        Assertions.assertThat(FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input)).isEqualTo(expected);
    }
}
