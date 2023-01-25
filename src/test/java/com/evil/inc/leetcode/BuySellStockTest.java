package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BuySellStockTest {

    @Test
    public void maxProfit() {
        BuySellStock buySellStock = new BuySellStock();
        Assertions.assertThat(buySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        Assertions.assertThat(buySellStock.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
        Assertions.assertThat(buySellStock.maxProfit(new int[]{2,4,1})).isEqualTo(2);
    }
}
