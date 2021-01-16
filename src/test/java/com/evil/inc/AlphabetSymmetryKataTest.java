package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetSymmetryKataTest {

    @Test
    public void solve() {
        assertArrayEquals(new int[]{4, 3, 1}, AlphabetSymmetryKata.solve(new String[]{"abode", "ABc", "xyzD"}));
        assertArrayEquals(new int[]{4, 3, 0}, AlphabetSymmetryKata.solve(new String[]{"abide", "ABc", "xyz"}));
        assertArrayEquals(new int[]{6, 5, 7}, AlphabetSymmetryKata.solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
        assertArrayEquals(new int[]{1, 3, 1, 3}, AlphabetSymmetryKata.solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
    }
}