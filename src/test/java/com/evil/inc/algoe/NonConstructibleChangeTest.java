package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NonConstructibleChangeTest {

    @Test
    public void nonConstructibleChange() {
        Assertions.assertThat(NonConstructibleChange.nonConstructibleChange(new int[]{1, 2, 5}))
                        .isEqualTo(4);
        Assertions.assertThat(NonConstructibleChange.nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}))
                        .isEqualTo(20);
    }
}
