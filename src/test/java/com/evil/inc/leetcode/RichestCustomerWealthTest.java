package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class RichestCustomerWealthTest {

    @Test
    public void solve() {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        Assertions.assertThat(richestCustomerWealth.solve(new int[][]{{1, 2, 3}, {3, 2, 1}})).isEqualTo(6);
        Assertions.assertThat(richestCustomerWealth.solve(new int[][]{{1, 5}, {7, 3}, {3, 5}})).isEqualTo(10);
        Assertions.assertThat(richestCustomerWealth.solve(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}})).isEqualTo(17);
    }
}
