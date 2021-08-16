package com.evil.inc.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return productSum(array, 1);

    }

    // O(n) time | O(d) space - where n is the total number of elements in the array,
    // including sub-elements, and d is the greatest depth of "special" arrays in the array
    public static int productSum(List<Object> array, int currentLevel) {
        int sum = 0;
        for (Object e : array) {
            if (e instanceof ArrayList) {
                sum += productSum((ArrayList<Object>) e, currentLevel + 1);
            } else {
                sum += (int) e;
            }
        }
        return sum * currentLevel;
    }

}
