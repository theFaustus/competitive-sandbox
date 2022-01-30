package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetectCapitalTest {

    @Test
    public void detectCapitalUse() {
        Assertions.assertThat(DetectCapital.solve("USA")).isTrue();
        Assertions.assertThat(DetectCapital.solve("leetcode")).isTrue();
        Assertions.assertThat(DetectCapital.solve("Google")).isTrue();
    }
}
