package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionKataTest {

    private static void testing(long n, int expected) {
        int actual = SectionKata.c(n);
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        testing(1, 1);
        testing(4, 4);
        testing(2019, 0);
        testing(4096576, 160);
        testing(5317636, 16);
        testing(10336225, 16);
        testing(2961841, 4);
        testing(13396105, 0);
    }
}