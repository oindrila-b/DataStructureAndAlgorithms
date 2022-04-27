package main.java.LeetCode.Arrays.Stock_Buy_Sell_to_Maximize_Profit.EasyLevel;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int minNumber = prices[0];
        int  minIndex = 0;
        int maxNumber = prices[prices.length -1];
        int  maxIndex = 0;


        for (int i =1; i< prices.length; i ++) {
                if (prices[i] < minNumber) {
                    minNumber = prices[i];
                    minIndex = i;
                }
                if (prices[i] > maxNumber) {
                    maxNumber = prices[i];
                    maxIndex = i;
                }

                if (minIndex > maxIndex){
                    return  0;
                } else {
                    maxProfit = maxNumber - minNumber;
                }

        }
        return maxProfit;
    }

}
