package main.java.LeetCode.Arrays.Four_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

        public List<List<Integer>> fourSum(int[] nums, int target) {
            //Result list
            List<List<Integer>> resultArray= new ArrayList<List<Integer>>();

            // if the array os null or it's empty
            if (nums == null || nums.length == 0)
                return resultArray;

            // storing length of array
            int n = nums.length;

            //Sorting the array
            Arrays.sort(nums);

            //Running two loops, First one travels from 0 - array length
            // Second one travels from i+1 to the end of array
            for (int i =0 ; i < n ; i ++) {
                for (int j =i+1; j< n ;j++) {

                    // finding the rest of the sum left from the target we need to find
                    int target_2 = target - nums[j] -nums[i];

                    int frontPointer = j+1; // points to the elements after j
                    int endPointer = n-1; // points to the last array element

                    // we will continue until the frontpointer is smaller than the backpointer
                    while (frontPointer < endPointer) {
                        int two_sum = nums[frontPointer] + nums[endPointer]; // sum of frontpointer + backpointer

                        // if the sum is less than the target2 we require, then
                        // since the array is sorted we move the frontpointer (left pointer) to the next
                        // element to it's right , as we need a larger value from the current one
                        if (two_sum < target_2)
                            frontPointer++;

                        // if the sum is more than the target2 we require, then
                        // since the array is sorted we move the endpointer (right pointer) to the next
                        // element to it's left , as we need a smaller value than the current one
                       else  if (two_sum > target_2)
                            endPointer--;

                       //if the sum is equal to the target value we need then we put it in a list
                       else {
                           List<Integer> quad = new ArrayList<>();
                           quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[frontPointer]);
                            quad.add(nums[endPointer]);
                            resultArray.add(quad);


                            // Now we skip the duplicates cuz it'll result in the same quad, and we wanna avoid that

                            //Skipping the values in the array which are the same as the current
                            // frontPointer elements value
                            while (frontPointer<endPointer && nums[frontPointer] == quad.get(3))
                                ++frontPointer;

                            //Skipping the values in the array which are the same as the current
                            // endPointer elements value
                            while (frontPointer<endPointer && nums[endPointer] == quad.get(4))
                                --endPointer;
                        }
                    }

                    // Skipping duplicate numbers after j pointer
                    while (j+1 <n && nums[j+1] == nums[j])
                    ++j;
                }
                // Skipping duplicate numbers after i pointer
                while (i+1 <n && nums[i+1] == nums[i])
                    ++i;
            }

            return resultArray;
    }
}
