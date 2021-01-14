package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberKataTest {
    private double precision = 0.0000000000001;

    @Test
    public void findUniq() {
        assertEquals(2.0, UniqueNumberKata.findUniq(new double[]{1, 2, 1, 1, 1, 1}), precision);
        assertEquals(1.0, UniqueNumberKata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(1.0, UniqueNumberKata.findUniq(new double[]{1, 0, 0}), precision);
        assertEquals(1.0, UniqueNumberKata.findUniq(new double[]{0, 0, 1}), precision);
        assertEquals(2.0, UniqueNumberKata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(2.0, UniqueNumberKata.findUniq(new double[]{2, 1, 1, 1, 1, 1}), precision);
        assertEquals(2.0, UniqueNumberKata.findUniq(new double[]{1, 1, 1, 1, 1, 2}), precision);
    }

}