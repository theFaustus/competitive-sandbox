package com.evil.inc.algoe;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {
    public static int firstDuplicateValue(int[] array) {
        Set<Integer> visited = new HashSet<>();
        for (int j : array) {
            if (visited.contains(j))
                return j;
            visited.add(j);
        }
        return -1;
    }
}
