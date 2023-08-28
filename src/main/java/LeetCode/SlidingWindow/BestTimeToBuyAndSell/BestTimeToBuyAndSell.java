package main.java.LeetCode.SlidingWindow.BestTimeToBuyAndSell;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {

        int maxProfit   = 0;
        for (int i = 0; i < prices.length -1; i++) {
        for (int j = i+1; j < prices.length; j++) {
            maxProfit = Math.max(maxProfit, (prices[j] - prices[i]));
        }
        }

        return maxProfit;
    }
    //optimised
    public int maxProfit2(int[] prices) {

        int min_price = prices[0];
        int maxprof = 0;

        for(int i=0;i<prices.length;i++){
            maxprof = Math.max(maxprof,prices[i]-min_price);
                min_price = Math.min(prices[i],min_price);
        }

        return maxprof;
    }
}



//    int buyDay = 0;
//    int sellDay = 0;
//
//        for (int i = 0; i < prices.length -1; i++) {
//        for (int j = i+1; j < prices.length; j++) {
//
//        }
//        }