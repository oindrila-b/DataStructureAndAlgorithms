package LeetCode.Arrays;

public class SmallerNumberThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int k =0;
        int arrayLength = nums.length;
    int resultArray[] = new int[arrayLength];
        for (int i=0;i<arrayLength;i++) {
            int count =0;
            for (int j=0;j< arrayLength;j++) {
                if ((nums[i] > nums[j]) && (j!=i)) {
                    count++;
                }
            }
            resultArray[k++] = count;
        }
        return resultArray;
    }
}
