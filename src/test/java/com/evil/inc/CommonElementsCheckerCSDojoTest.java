package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonElementsCheckerCSDojoTest {

    @Test
    public void findCommonElements() {

        Assertions.assertThat(CommonElementsCheckerCSDojo.findCommonElements(new int[]{1, 3, 4, 6, 7, 9}, new int[]{1, 2, 4, 5, 9, 10}))
                .isEqualTo(new Integer[]{1, 4, 9});
        Assertions.assertThat(CommonElementsCheckerCSDojo.findCommonElements(new int[]{1, 2, 9, 10, 11, 12}, new int[]{0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15}))
                .isEqualTo(new Integer[]{1, 2, 9, 10, 12});
        Assertions.assertThat(CommonElementsCheckerCSDojo.findCommonElements(new int[]{0, 1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10, 11}))
                .isEqualTo(new Integer[]{});
    }
}