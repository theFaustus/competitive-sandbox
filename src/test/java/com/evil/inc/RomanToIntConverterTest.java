package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntConverterTest {

    @Test
    public void romanToInt() {
        assertEquals(3, RomanToIntConverter.romanToInt("III"));
        assertEquals(4, RomanToIntConverter.romanToInt("IV"));
        assertEquals(9, RomanToIntConverter.romanToInt("IX"));
        assertEquals(58, RomanToIntConverter.romanToInt("LVIII"));
    }
}