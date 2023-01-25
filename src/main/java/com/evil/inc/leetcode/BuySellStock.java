package com.evil.inc.leetcode;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        System.out.println("----------------------------------------------------------------------------------------------");
        int profit = 0;
        int priceToBuy = prices[0];
        for (int price : prices) {
            System.out.println("Price to buy: " + priceToBuy + " Current price: " + price);
            priceToBuy = Math.min(priceToBuy, price);
            System.out.println("New price to buy: " + priceToBuy);
            System.out.println("Profit: " + profit + " Current price: " + price + " Current profit: " + (price - priceToBuy));
            profit = Math.max(profit, price - priceToBuy);
            System.out.println("New profit: " + profit);
        }
        return profit;
    }
}
