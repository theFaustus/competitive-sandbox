package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.evil.inc.LongestCommonPrefix.longestCommonPrefix;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest() {
        Assertions.assertThat(longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        Assertions.assertThat(longestCommonPrefix(new String[]{"dog", "doracecar", "docar"})).isEqualTo("do");
        Assertions.assertThat(longestCommonPrefix(new String[]{"dorag", "doracecar", "doracar"})).isEqualTo("dora");
        Assertions.assertThat(longestCommonPrefix(new String[]{"cdog", "cdoracecag", "cdoag"})).isEqualTo("cdo");
        Assertions.assertThat(longestCommonPrefix(new String[]{"cir", "car"})).isEqualTo("c");
    }
}