package com.evil.inc.algoe;

import java.util.Arrays;

public class TandemBicycle {
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int speeds = 0;
        for (int i = 0, j = redShirtSpeeds.length - 1; i < redShirtSpeeds.length; i++, j--) {
            if (fastest)
                speeds += Math.max(redShirtSpeeds[i], blueShirtSpeeds[j]);
            else
                speeds += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return speeds;
    }
}

