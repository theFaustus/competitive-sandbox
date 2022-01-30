package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assertions.assertThat(InsertionSort.insertionSort(input)).isEqualTo(expected);
    }
}
