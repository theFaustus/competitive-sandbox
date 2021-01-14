package com.evil.inc;

public class SumOfSquares {
    /**
     * The task is simply stated. Given an integer n (3 < n < 109), find the length of the smallest list of perfect squares which add up to n. Come up with the best algorithm you can; you'll need it!
     * <p>
     * Examples:
     * <p>
     * sum_of_squares(17) = 2
     * 17 = 16 + 1 (4 and 1 are perfect squares).
     * sum_of_squares(15) = 4
     * 15 = 9 + 4 + 1 + 1. There is no way to represent 15 as the sum of three perfect squares.
     * sum_of_squares(16) = 1
     * 16 itself is a perfect square.
     * Time constraints:
     * <p>
     * 5 easy (sample) test cases: n < 20
     * <p>
     * 5 harder test cases: 1000 < n < 15000
     * <p>
     * 5 maximally hard test cases: 5 * 1e8 < n < 1e9
     * <p>
     * 300 random maximally hard test cases: 1e8 < n < 1e9
     */
    public static int nSquaresFor(int n) {
        if (n <= 3) return n;
        int numberOfSquares = n;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (square > n)
                break;
            else
                numberOfSquares = Math.min(numberOfSquares, 1 + nSquaresFor((n - square)));
        }
        return numberOfSquares;
    }

    public static int nSquaresForDP(int n) {
        if (n <= 3) return n;

        int[] visited = new int[n + 1];
        visited[0] = 0;
        visited[1] = 1;
        visited[2] = 2;
        visited[3] = 3;

        for (int i = 4; i <= n; i++) {

            visited[i] = i;

            for (int j = 1; j <= Math.ceil(Math.sqrt(i)); j++) {
                int square = j * j;
                if (square > i)
                    break;
                else
                    visited[i] = Math.min(visited[i], 1 + visited[i - square]);
            }
        }

        return visited[n];
    }
}
