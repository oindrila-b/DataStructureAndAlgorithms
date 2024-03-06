package main.java.LeetCode.Arrays.LargestNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        return Arrays.stream(nums).mapToObj(Integer::toString).
                sorted((n1, n2) -> Double.compare(Double.parseDouble(n2 + n1), Double.parseDouble(n1 + n2))).
                collect(Collectors.joining()).replaceFirst("^0+", "0");
    }
}
