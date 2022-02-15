package LeetCode.Arrays;

public class ArrayForPermutataion {

        public static int[] buildArray(int[] nums) {
            int len = nums.length;
            int i;
            int ans[] = new int [len];
            for(i=0;i<len;i++)
            {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }

    public static void main(String[] args) {

    }

}

