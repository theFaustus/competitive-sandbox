package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        Assertions.assertThat(BinarySearch.binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33)).isEqualTo(3);
    }
}