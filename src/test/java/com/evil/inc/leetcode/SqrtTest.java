package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void solve() {
        Sqrt sqrt = new Sqrt();
        Assertions.assertThat(sqrt.solve(4)).isEqualTo(2);
        Assertions.assertThat(sqrt.solve(8)).isEqualTo(2);
    }
}
