package main.java.LeetCode.SlidingWindow.BestTimeToBuyAndSell;

import main.java.LeetCode.SlidingWindow.BestTimeToBuyAndSell.BestTimeToBuyAndSell;

public class Main {
    public static void main(String[] args) {
        int[] prices = {7,5, 1,6,4,3,9};
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        System.out.println(bestTimeToBuyAndSell.maxProfit2(prices));
    }
}
