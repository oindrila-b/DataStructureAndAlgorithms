package main.java.LeetCode.Binary.ArrangingCoins;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int count = 0;
        int r = n;
        for (int i = 0; i < n; i++) {
            r = r - (i + 1);
            if (r < 0) return count;
            count++;
        }
        return count;
    }
}
