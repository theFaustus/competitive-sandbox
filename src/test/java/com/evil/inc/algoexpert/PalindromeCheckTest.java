package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    @Test
    public void isPalindrome() {
        Assertions.assertThat(PalindromeCheck.isPalindrome("abcdcba")).isTrue();
    }

    @Test
    public void isPalindrome2() {
        Assertions.assertThat(PalindromeCheck.isPalindrome2("abcdcba")).isTrue();
    }
}