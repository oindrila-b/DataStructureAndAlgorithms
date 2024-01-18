package main.java.LeetCode.TwoPointer.TwoSumTwo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (indexMap.containsKey((target - numbers[i]))) {
                return new int[]{i, indexMap.get(target-numbers[i])};
            }else{
                indexMap.put((target - numbers[i]),( i + 1));
            }
        }
        return new int[]{};
    }
}
