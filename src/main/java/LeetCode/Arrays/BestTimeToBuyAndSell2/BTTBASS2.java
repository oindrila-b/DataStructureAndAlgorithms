package main.java.LeetCode.Arrays.BestTimeToBuyAndSell2;

public class BTTBASS2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // Buy the stock on the first day
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length ; i++) {
            // if stock price on the next day is less, buy sell current stock and buy on that day
            if (prices[i] < prices[i-1]) {
                maxProfit += prices[i-1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        // sell the stock at hand
         maxProfit +=  prices[prices.length - 1] - buyPrice;
        return maxProfit;
    }
}
