package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void solve() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assertions.assertThat(climbingStairs.solve(5)).isEqualTo(8);
//        Assertions.assertThat(climbingStairs.solve(2)).isEqualTo(2);
//        Assertions.assertThat(climbingStairs.solve(3)).isEqualTo(3);
//        Assertions.assertThat(climbingStairs.solve(4)).isEqualTo(5);
//        Assertions.assertThat(climbingStairs.solve(6)).isEqualTo(13);
//        Assertions.assertThat(climbingStairs.solve(7)).isEqualTo(21);
    }
}
