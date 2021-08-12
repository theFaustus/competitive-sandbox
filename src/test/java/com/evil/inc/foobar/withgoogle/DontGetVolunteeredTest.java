package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DontGetVolunteeredTest {
    @Test
    public void solution() {
        Assertions.assertThat(DontGetVolunteered.solution(0, 1)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        Assertions.assertThat(DontGetVolunteered.solution(19, 36)).isEqualTo(1);
    }

    @Test
    public void solution3() {
        Assertions.assertThat(DontGetVolunteered.solution(DontGetVolunteered.toNumber(new int[]{0, 7}), DontGetVolunteered.toNumber(new int[]{7, 0}))).isEqualTo(6);
    }


    //        final int[][] board = {
    //                {0, 1, 2, 3, 4, 5, 6, 7},
    //                {8, 9, 10, 11, 12, 13, 14, 15},
    //                {16, 17, 18, 19, 20, 21, 22, 23},
    //                {24, 25, 26, 27, 28, 29, 30, 31},
    //                {32, 33, 34, 35, 36, 37, 38, 39},
    //                {40, 41, 42, 43, 44, 45, 46, 47},
    //                {48, 49, 50, 51, 52, 53, 54, 55},
    //                {56, 57, 58, 59, 60, 61, 62, 63},
    //        };


    @Test
    public void toXY() {
        Assertions.assertThat(DontGetVolunteered.toXY(19)).isEqualTo(new int[]{3, 2});
        Assertions.assertThat(DontGetVolunteered.toXY(36)).isEqualTo(new int[]{4, 4});
    }

    @Test
    public void toNumber() {
        Assertions.assertThat(DontGetVolunteered.toNumber(new int[]{3, 2})).isEqualTo(19);
        Assertions.assertThat(DontGetVolunteered.toNumber(new int[]{4, 4})).isEqualTo(36);
    }
}