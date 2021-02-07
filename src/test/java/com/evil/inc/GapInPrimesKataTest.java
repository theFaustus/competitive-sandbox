package com.evil.inc;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GapInPrimesKataTest {

    @Test
    public void gap() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimesKata.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimesKata.gap(4,100,110)));
        assertEquals(null, GapInPrimesKata.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimesKata.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimesKata.gap(10,300,400)));

    }

    @Test
    public void gapClever() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimesKata.gapClever(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimesKata.gapClever(4,100,110)));
        assertEquals(null, GapInPrimesKata.gapClever(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimesKata.gapClever(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimesKata.gapClever(10,300,400)));
    }
}