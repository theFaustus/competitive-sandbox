package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeOverlappingIntervalsTest {

    @Test
    public void mergeOverlappingIntervals() {
        int[][] intervals =
                new int[][] {
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] expected =
                new int[][] {
                        {1, 2},
                        {3, 8},
                        {9, 10}
                };
        int[][] actual = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
        Assertions.assertThat(actual).isDeepEqualTo(expected);
    }
}
