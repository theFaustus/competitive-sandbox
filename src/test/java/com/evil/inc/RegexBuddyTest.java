package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RegexBuddyTest {

    @Test
    public void split() {
        Assertions.assertThat(RegexBuddy.split("He is a very very good boy, isn't he?"))
                .isEqualTo(Arrays.asList("He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"));

    }

    @Test
    public void replaceDuplicates() {
        Assertions.assertThat(RegexBuddy.replaceDuplicates("Goodbye bye bye world world world"))
                .isEqualTo("Goodbye bye world");
    }
}