package main.java.LeetCode.Arrays.Kids_With_The_Greatest_Candies;

import java.util.ArrayList;
import java.util.List;

public class KIdsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWithCandies = new ArrayList<>();
        int max = candies[0];
        for (int i:candies) {
            if (i>max){
                max = i;
            }
        }
        for (int i:candies) {
            if ((i+extraCandies) >= max){
                kidsWithCandies.add(Boolean.TRUE);
            }
            else {
                kidsWithCandies.add(Boolean.FALSE);
            }
        }
        return kidsWithCandies;
    }
}


