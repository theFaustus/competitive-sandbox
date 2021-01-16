package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageValidatorKataTest {

    @Test
    public void isAValidMessage() {
        assertTrue(MessageValidatorKata.isAValidMessage("3hey5hello2hi"));
        assertTrue(MessageValidatorKata.isAValidMessage("4code13hellocodewars"));
        assertFalse(MessageValidatorKata.isAValidMessage("3hey5hello2hi5"));
        assertFalse(MessageValidatorKata.isAValidMessage("code4hello5"));
        assertTrue(MessageValidatorKata.isAValidMessage("1a2bb3ccc4dddd5eeeee"));
        assertTrue(MessageValidatorKata.isAValidMessage("70cBsltwjDvnFIkEfdBPLEkysfXOHDaakdAORlyNVjBNkZRVfsjCURkLCcQSEAFKMIyIbTzP44kNPpQwTxTGUAACxKnRBWncBLHqPlczOGaNcWzMCdTCBr70KrPmDaRNOQysItkkKrzKlEkmWmpDjSbNflsLcDhovcjSsEQIBTzRnpDuRdnIEUQKOJsKtV117pqsruNokrqNYNJYjFjLNePEffZWJKhEhJTlRZIujSsYJXIrTvXDhYYNtvVVYgnHCZXLMNmfsqscziWQoXblUOcKRDvfQDKurJfRyKabYemgGlxMTtGnsH"));
        assertTrue(MessageValidatorKata.isAValidMessage("0"));
        assertTrue(MessageValidatorKata.isAValidMessage(""));
    }
}