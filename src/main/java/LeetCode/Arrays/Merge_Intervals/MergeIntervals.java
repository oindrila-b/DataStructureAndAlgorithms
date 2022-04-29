package main.java.LeetCode.Arrays.Merge_Intervals;



import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {


        // sort the array based on the first number in each array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        //create a linked list of integer arrays
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval: intervals) { // for each interval

            // add it normally if the list is empty() for the first element
            // or if the last element of the previous interval is smaller than the first element of the current interval
                if (merged.isEmpty() ||  merged.getLast()[1] < interval[0]){
                    merged.add(interval);
                }else {
                 //   if the last element of the previous interval is greater than the first element of the current interval
                    // then get the max value out of the last elements of both of them and add that in the list
                    merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1] );
                }
        }

        // return the linked list as a 2D array
        return merged.toArray(new int[merged.size()][]);

    }



}
