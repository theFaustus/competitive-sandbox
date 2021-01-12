package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCodeMoneyBankTest {

    @Test
    public void totalMoney() {
        Assertions.assertThat(new LeetCodeMoneyBank().totalMoney(4)).isEqualTo(10);
        Assertions.assertThat(new LeetCodeMoneyBank().totalMoney(10)).isEqualTo(37);
    }
}