package main.java.LeetCode.Arrays.Stock_Buy_Sell_to_Maximize_Profit.MediumLevel;

public class Main {
    public static void main(String[] args)
    {

        // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        StockBuySellForMaxProfit stock = new StockBuySellForMaxProfit();

        System.out.println(stock.maxProfit(price));


    }
}
