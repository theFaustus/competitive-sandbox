package com.evil.inc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfIslandsSolver {
    public static int[] getSizesOfIslands(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    sizes.add(getIslandLength(i, j, matrix));
                }
            }
        }
        return sizes.stream().mapToInt(i -> i).toArray();
    }

    private static int getIslandLength(int i, int j, int[][] matrix) {
        if (i < 0 || j < 0 || (i >= matrix.length) || (j >= matrix[i].length) || matrix[i][j] != 1)
            return 0;
        matrix[i][j] = 0;
        int sum = 1;
        sum += getIslandLength(i, j + 1, matrix);
        sum += getIslandLength(i, j - 1, matrix);
        sum += getIslandLength(i + 1, j, matrix);
        sum += getIslandLength(i - 1, j, matrix);
        return sum;
    }
}
