package main.java.LeetCode.Arrays.SignOfArray;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SignOfAnArray {
    public int arraySign(int[] nums) {

        if ((Arrays.stream(nums).reduce(0, (a, b) -> ((b == 0) ? (1) : (a) ) ) ) > 0)
            return 0;

        int negativeCount = Arrays.stream(nums).reduce(0, (a, b) -> ((b < 0) ? ++a : a));

        return (negativeCount % 2 == 1) ? -1 : 1;

    }

}
