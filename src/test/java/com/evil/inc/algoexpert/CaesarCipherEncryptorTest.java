package com.evil.inc.algoexpert;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CaesarCipherEncryptorTest {

    @Test
    public void caesarCypherEncryptor() {
        assertThat(CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 2)).isEqualTo("zab");
    }
}