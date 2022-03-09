package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArrayOfProductsTest {

    @Test
    public void arrayOfProducts() {
        int[] input = new int[]{5, 1, 4, 2};
        int[] expected = new int[]{8, 40, 10, 20};
        int[] actual = ArrayOfProducts.arrayOfProducts(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
