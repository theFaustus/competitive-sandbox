package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;


public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        Assertions.assertThat(lengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
        Assertions.assertThat(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
        Assertions.assertThat(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }

    @Test
    public void lengthOfLastWord2() {
        LengthOfLastWord lengthOfLastWord2 = new LengthOfLastWord();
        Assertions.assertThat(lengthOfLastWord2.lengthOfLastWord2("Hello World")).isEqualTo(5);
        Assertions.assertThat(lengthOfLastWord2.lengthOfLastWord2("   fly me   to   the moon  ")).isEqualTo(4);
        Assertions.assertThat(lengthOfLastWord2.lengthOfLastWord2("luffy is still joyboy")).isEqualTo(6);
    }
}
