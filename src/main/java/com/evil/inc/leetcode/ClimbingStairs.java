package com.evil.inc.leetcode;

public class ClimbingStairs {
    public int solve1(int n) {
        if (n < 3) return n;
        return solve(n - 1) + solve(n - 2);
    }

    public int solve(int n) {
        if (n < 3) return n;
        int[] memo = new int[Math.max(3, n + 1)];
        memo[1] = 1;
        memo[2] = 2;
        return memoSolve(memo, n);
    }

    private int memoSolve(int[] memo, int n) {
        System.out.println(n);
        if(n == 0 || memo[n] != 0) return memo[n];
        memo[n] = memoSolve(memo, n - 1) + memoSolve(memo, n - 2);
        return memo[n];
    }
}
