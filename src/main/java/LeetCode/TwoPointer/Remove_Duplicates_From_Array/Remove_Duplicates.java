package main.java.LeetCode.TwoPointer.Remove_Duplicates_From_Array;

public class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {

        int j=0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]!=nums[i+1]) {
                nums[j++]=nums[i];
            }
        }
        nums[j++]=nums[nums.length-1];
        return j;
    }



    public static void main(String[] args) {
        Remove_Duplicates remove_duplicates = new Remove_Duplicates();
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove_duplicates.removeDuplicates(arr));
    }
}
