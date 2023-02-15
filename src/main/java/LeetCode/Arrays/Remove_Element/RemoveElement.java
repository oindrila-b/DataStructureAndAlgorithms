package main.java.LeetCode.Arrays.Remove_Element;

public class RemoveElement {

    public static  int removeElement(int[] nums, int val) {
        int numberOfElements = 0;
        for(int i =0; i< nums.length; i++) {
            if(nums[i] != val) {
                nums[numberOfElements++] = nums[i];
            }
        }

        return numberOfElements;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int arr[] = {1,2,3,4,5,6, 8,9,2,10,2,14,2};
        System.out.println( removeElement(arr, 2));
    }

}
