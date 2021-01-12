package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringComparatorTest {

    @Test
    public void getSmallestAndLargest() {
        Assertions.assertThat(SubstringComparator.getSmallestAndLargest("welcometojava", 3)).isEqualTo("ava\nwel");
    }

    @Test
    public void getSmallestAndLargestCompareTo() {
        Assertions.assertThat(SubstringComparator.getSmallestAndLargestCompareTo("welcometojava", 3)).isEqualTo("ava\nwel");
    }
}