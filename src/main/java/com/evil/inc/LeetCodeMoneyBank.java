package com.evil.inc;

/**
 * 1716. Calculate Money in Leetcode Bank
 * <p>
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
 * <p>
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 4
 * Output: 10
 * Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 10
 * Output: 37
 * Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37.
 */
public class LeetCodeMoneyBank {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int moneyOnMonday = 1;
        for (int i = 0, money = moneyOnMonday; i < n; i++) {
            if (i != 0 && i % 7 == 0)
                money = ++moneyOnMonday;
            totalMoney += money++;
        }

        return totalMoney;
    }
}
