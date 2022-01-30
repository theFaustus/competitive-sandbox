package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SortedSquaredArrayPrinterTest {

    @Test
    public void sortedSquaredArray() {
        Assertions.assertThat(SortedSquaredArrayPrinter.sortedSquaredArray(new int[]{1, 2, 3, 5, 6, 8, 9}))
                .isEqualTo(new int[]{1, 4, 9, 25, 36, 64, 81});
        Assertions.assertThat(SortedSquaredArrayPrinter.sortedSquaredArray(new int[]{-9, -6, 1, 2, 3, 5, 6, 8, 9}))
                .isEqualTo(new int[]{1, 4, 9, 25, 36, 36, 64, 81, 81});
    }
}
