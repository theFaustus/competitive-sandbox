package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PangramCheckerKataTest {

    @Test
    public void check() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerKata pc = new PangramCheckerKata();
        assertEquals(true, pc.check(pangram1));
        String pangram2 = "You shall not pass!";
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void checkUsingStream() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerKata pc = new PangramCheckerKata();
        assertEquals(true, pc.checkUsingStream(pangram1));
        String pangram2 = "You shall not pass!";
        assertEquals(false, pc.checkUsingStream(pangram2));
    }

    @Test
    public void checkUsingCharIteration() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerKata pc = new PangramCheckerKata();
        assertEquals(true, pc.checkUsingCharIteration(pangram1));
        String pangram2 = "You shall not pass!";
        assertEquals(false, pc.checkUsingCharIteration(pangram2));
    }

}