package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

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
