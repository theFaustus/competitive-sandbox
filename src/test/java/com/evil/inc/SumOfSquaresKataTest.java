package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSquaresKataTest {

    @Test
    public void nSquaresFor() {
        assertEquals(4, SumOfSquaresKata.nSquaresFor(15));
        assertEquals(1, SumOfSquaresKata.nSquaresFor(16));
        assertEquals(2, SumOfSquaresKata.nSquaresFor(17));
        assertEquals(2, SumOfSquaresKata.nSquaresFor(18));
        assertEquals(3, SumOfSquaresKata.nSquaresFor(19));
    }

    @Test
    public void nSquaresForDP() {
        assertEquals(4, SumOfSquaresKata.nSquaresForDP(15));
        assertEquals(1, SumOfSquaresKata.nSquaresForDP(16));
        assertEquals(2, SumOfSquaresKata.nSquaresForDP(17));
        assertEquals(2, SumOfSquaresKata.nSquaresForDP(18));
        assertEquals(3, SumOfSquaresKata.nSquaresForDP(19));
    }
}