package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromerTest {

    @Test
    public void isPalindrome() {
        assertTrue(Palindromer.isPalindrome(121));
        assertFalse(Palindromer.isPalindrome(-121));
    }
}