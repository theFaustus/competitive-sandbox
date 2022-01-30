package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement() {
        final int[] nums = {3, 2, 2, 3};
        Assertions.assertThat(RemoveElement.removeElement(nums, 3)).isEqualTo(2);
        Assertions.assertThat(nums).isEqualTo(new int[]{2, 2, 3, 3});

        final int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        Assertions.assertThat(RemoveElement.removeElement(nums2, 2)).isEqualTo(5);
        Assertions.assertThat(nums2).isEqualTo(new int[]{0, 1, 4, 0, 3});
    }
}
