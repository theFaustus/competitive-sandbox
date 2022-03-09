package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDuplicateValueTest {

    @Test
    public void firstDuplicateValue() {
        var input = new int[] {2, 1, 5, 2, 3, 3, 4};
        var expected = 2;
        var actual = FirstDuplicateValue.firstDuplicateValue(input);
        Assertions.assertThat(actual).isEqualTo(actual);
    }
}
