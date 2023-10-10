package main.java.LeetCode.TwoPointer.TwoSum2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> elementIndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (elementIndexMap.containsKey(target - numbers[i])) {
                return Arrays.stream(new int[] {(i+1), (elementIndexMap.get(target - numbers[i]))}).sorted().toArray();
            }else {
                elementIndexMap.put(numbers[i], (i+1));
            }
        }
        return new int[]{};
    }
}
