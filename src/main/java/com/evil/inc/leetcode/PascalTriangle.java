package com.evil.inc.leetcode;

import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1) return List.of(List.of(1));
        if(numRows == 2) return List.of(List.of(1), List.of(1, 1));
        List<List<Integer>> result = new java.util.ArrayList<>(List.of(List.of(1), List.of(1, 1)));
        for (int i = 2; i < numRows; i++) {
            List<Integer> lastRow = result.get(result.size() - 1);
            List<Integer> newRow = new java.util.ArrayList<>(List.of(1));
            for (int j = 1, lastRowSize = lastRow.size(); j < lastRowSize; j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j - 1));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}
