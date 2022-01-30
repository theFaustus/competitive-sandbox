package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicates() {
        Assertions.assertThat(RemoveDuplicatesSortedArray.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
        Assertions.assertThat(RemoveDuplicatesSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})).isEqualTo(5);
    }
}
