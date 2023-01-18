package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void canConstruct() {
        RansomNote ransomNote = new RansomNote();
        Assertions.assertThat(ransomNote.canConstruct("a", "b")).isFalse();
        Assertions.assertThat(ransomNote.canConstruct("aa", "ab")).isFalse();
        Assertions.assertThat(ransomNote.canConstruct("aa", "aab")).isTrue();
    }
}
