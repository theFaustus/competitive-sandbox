package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void solve() {
        ReverseString reverseString = new ReverseString();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString.solve(chars);
        Assertions.assertThat(chars).isEqualTo(new char[]{'o','l','l','e','h'});
    }
}
