package main.java.LeetCode.SlidingWindow.NumberOfSubArraysofSizeKandAverageGreaterthanorEqualtoThreshold;

public class NumberOfSubArrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = k-1;
        int numberOfSubArrays= 0;
        while (end < arr.length) {
            int subArraySum = getSum(arr, start, end);
            int average = (subArraySum/ k);
            if (average >= threshold) {
                numberOfSubArrays++;
                start++;
                end++;
            } else{
                start++;
                end++;
            }
        }
        return numberOfSubArrays;
    }

    private int getSum(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
