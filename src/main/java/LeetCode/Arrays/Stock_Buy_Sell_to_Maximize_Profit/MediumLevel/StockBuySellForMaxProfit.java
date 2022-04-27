package main.java.LeetCode.Arrays.Stock_Buy_Sell_to_Maximize_Profit.MediumLevel;

public class StockBuySellForMaxProfit {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;

       for (int i =1; i< prices.length; i ++) {
           if (prices[i] > prices[ i-1]) {
               maxProfit += prices[i] - prices[ i-1];
           }
       }
       return maxProfit;
    }


}
