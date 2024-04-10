package main.java.LeetCode.Arrays.Concatenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concatenation2 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        int k = 0;
        for(int i = 0; i < 2; i++) {
            for (int j :nums) {
                ans[k++] = j;
                // answers
            }
        }
        return ans;
    }
}
