package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSquaresTest {

    @Test
    public void nSquaresFor() {
        assertEquals(4, SumOfSquares.nSquaresFor(15));
        assertEquals(1, SumOfSquares.nSquaresFor(16));
        assertEquals(2, SumOfSquares.nSquaresFor(17));
        assertEquals(2, SumOfSquares.nSquaresFor(18));
        assertEquals(3, SumOfSquares.nSquaresFor(19));
    }

    @Test
    public void nSquaresForDP() {
        assertEquals(4, SumOfSquares.nSquaresForDP(15));
        assertEquals(1, SumOfSquares.nSquaresForDP(16));
        assertEquals(2, SumOfSquares.nSquaresForDP(17));
        assertEquals(2, SumOfSquares.nSquaresForDP(18));
        assertEquals(3, SumOfSquares.nSquaresForDP(19));
    }
}