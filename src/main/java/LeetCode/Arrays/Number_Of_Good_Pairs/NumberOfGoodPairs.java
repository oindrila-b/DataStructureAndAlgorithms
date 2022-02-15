package LeetCode.Arrays;

public class NumberOfGoodPairs  {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        int i,j;
        for (i=0;i<nums.length;i++){
            for (j=0;j<nums.length;j++){
                if ((nums[i] == nums[j] ) && (i < j))
                    count ++;
            }
        }
        return  count;
    }
}
