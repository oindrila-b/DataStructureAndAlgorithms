package main.java.LeetCode.Arrays.Richest_Customer;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for(int i =0;i <accounts.length; i++) {
            int wealth = 0;
            for(int j = 0; j< accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(maximumWealth < wealth) {
                maximumWealth = wealth;
            }

        }
        return maximumWealth;
    }
}
