package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BracketsParserTest {
    @Test
    public void isBalanced() {
        Assertions.assertThat(new BracketsParser().isBalanced("{}")).isTrue();
        Assertions.assertThat(new BracketsParser().isBalanced("{{")).isFalse();
        Assertions.assertThat(new BracketsParser().isBalanced("{()}")).isTrue();
        Assertions.assertThat(new BracketsParser().isBalanced("{[()]}")).isTrue();
        Assertions.assertThat(new BracketsParser().isBalanced("{}()[]")).isTrue();
        Assertions.assertThat(new BracketsParser().isBalanced("({)}")).isFalse();
        Assertions.assertThat(new BracketsParser().isBalanced("{{")).isFalse();
        Assertions.assertThat(new BracketsParser().isBalanced("{{}}[[[]]](())")).isTrue();
        Assertions.assertThat(new BracketsParser().isBalanced("[]({})")).isTrue();
    }
}