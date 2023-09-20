package main.java.LeetCode.TwoPointer.RemoveDuplicates2;


// 1,1,1,2,2,3 // op -> 5, nums = [1,1,2,2,3,_]
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++)
            if(nums[i]!=nums[j-1])
                nums[++j]=nums[i];
        return j+1;
    }


    
        
}
