package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaitingTimeTest {

    @Test
    public void minimumWaitingTime() {
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = WaitingTime.minimumWaitingTime(queries);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}