package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void selectionSort() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};

        Assertions.assertThat(SelectionSort.selectionSort(input)).isEqualTo(expected);
    }
}
