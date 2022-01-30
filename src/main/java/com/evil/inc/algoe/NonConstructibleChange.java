package com.evil.inc.algoe;

import java.util.Arrays;

public class NonConstructibleChange {

    //[1, 2, 5]
    //[1, 1, 2, 3, 5, 7, 22]
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentAmountOfChange = 0;
        for (final int coin : coins) {
            if (coin > currentAmountOfChange + 1) {
                return currentAmountOfChange + 1;
            } else {
                currentAmountOfChange += coin;
            }
        }

        return currentAmountOfChange + 1;
    }
}
