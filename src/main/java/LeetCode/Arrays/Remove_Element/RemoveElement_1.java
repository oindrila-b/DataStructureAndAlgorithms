package main.java.LeetCode.Arrays.Remove_Element;

public class RemoveElement_1 {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val) {
        int numberOfElements = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[numberOfElements++] = nums[i];
            }
        }
        return numberOfElements;
    }
}
