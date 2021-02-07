package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParanthesesTest {

    @Test
    public void check() {
        Assertions.assertThat(ValidParantheses.check("()")).isTrue();
        Assertions.assertThat(ValidParantheses.check("((")).isFalse();
        Assertions.assertThat(ValidParantheses.check("()[]{}")).isTrue();
        Assertions.assertThat(ValidParantheses.check("(]")).isFalse();
        Assertions.assertThat(ValidParantheses.check("(])]")).isFalse();
        Assertions.assertThat(ValidParantheses.check("{[]}")).isTrue();
        Assertions.assertThat(ValidParantheses.check(")(){}")).isFalse();
    }
}