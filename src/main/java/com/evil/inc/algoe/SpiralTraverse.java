package com.evil.inc.algoe;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = array.length - 1;
        int columnStart = 0;
        int columnEnd = array[0].length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                result.add(array[rowStart][i]);
            }
            System.out.println(result);
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                result.add(array[i][columnEnd]);
            }
            System.out.println(result);
            for (int i = columnEnd - 1; i >= columnStart; i--) {
                if(rowStart == rowEnd)
                    break;
                result.add(array[rowEnd][i]);
            }
            System.out.println(result);

            for (int i = rowEnd - 1; i > rowStart; i--) {
                if(columnStart == columnEnd)
                    break;
                result.add(array[i][columnStart]);
            }
            System.out.println(result);
            rowStart++;
            columnStart++;
            rowEnd--;
            columnEnd--;
        }

        return result;
    }
}
