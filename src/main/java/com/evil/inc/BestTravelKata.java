package com.evil.inc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BestTravelKata {

    static Integer bestSum;

    public static Integer chooseBestSum(int requiredSum, int length, List<Integer> ls) {
        bestSum = 0;
        choose(requiredSum, length, ls, 0, 0);
        return bestSum == 0 ? null : bestSum;
    }

    //clever impl
    private static void choose(int requiredSum, int length, List<Integer> ls, int index, int sum) {
        System.out.println();
        if (sum > requiredSum)
            return;

        if (length == 0) {
            bestSum = Math.max(sum, bestSum);
            return;
        }

        for (int i = index; i < ls.size(); i++) {
            choose(requiredSum, length - 1, ls, i + 1, sum + ls.get(i));
        }

    }

//
//    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//        int[] ints = ls.stream().mapToInt(i -> i).toArray();
//        int[] combinations = new int[k];
//        List<Integer> sums = new ArrayList<>();
//        combinations(ints, combinations, sums, 0, ints.length - 1, 0);
//        return sums.stream().sorted(Comparator.reverseOrder()).filter(i -> i <= t).findFirst().orElse(null);
//    }
//
//    static void combinations(int[] arr, int[] data, List<Integer> sums, int start,
//                             int end, int index) {
//        if (index == data.length) {
////            for (int j = 0; j < data.length; j++)
////                System.out.print(data[j] + " ");
////            System.out.println();
//            int sum = 0;
//            for (int i = 0; i < data.length; i++) {
//                sum += data[i];
//            }
//            sums.add(sum);
//            return;
//        }
//
//        for (int i = start; i <= end && end - i + 1 >= data.length - index; i++) {
//            data[index] = arr[i];
//            combinations(arr, data, sums, i + 1, end, index + 1);
//        }
//    }
}
