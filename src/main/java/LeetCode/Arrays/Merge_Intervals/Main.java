package main.java.LeetCode.Arrays.Merge_Intervals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1,3},
                {2,6},
                {8,10},
                {15, 25}};

        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] recievedArray = mergeIntervals.merge(array);

        System.out.println(Arrays.deepToString(recievedArray));

    }
}
