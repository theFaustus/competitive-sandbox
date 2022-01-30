package com.evil.inc.algoe;

import java.util.Arrays;

public class WaitingTime {
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        System.out.println(Arrays.toString(queries));
        int currentWaitingTime = 0;
        int minimumWaitingTime = 0;
        for (int i = 0; i < queries.length; i++) {
            currentWaitingTime += (i == 0 ? 0 : queries[i - 1]);
            minimumWaitingTime += currentWaitingTime;
        }
        return minimumWaitingTime;
    }
}
