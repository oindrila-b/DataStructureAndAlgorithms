package main.java.LeetCode.Arrays.Concatenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concatenation2 {
    // Reimplementation of concat code
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        int k = 0;
        for(int i = 0; i < 2; i++) {
            for (int j :nums) {
                System.out.println(ans[k]);
                ans[k++] = j;
                // answers
            }
        }
        return ans;
    }
}
