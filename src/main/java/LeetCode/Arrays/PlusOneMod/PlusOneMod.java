package main.java.LeetCode.Arrays.PlusOneMod;

import java.util.ArrayList;
import java.util.List;

public class PlusOneMod {
    public int[] plusOne(int[] digits) {

        int plusOneDigit = digits[digits.length - 1];

        plusOneDigit += 1;

        List resultArray = new ArrayList();
        for (int i = 0; i < digits.length - 1; i++) {
            resultArray.add(digits[i]);
        }

        String temp = Integer.toString(plusOneDigit);

        for (int i = 0; i < temp.length(); i++) {
            int num = Character.getNumericValue(temp.charAt(i));
            resultArray.add(num);
        }

        int[] result = new int[resultArray.size()];
        for (int i =0; i< resultArray.size();i ++) {
            result[i] = (int) resultArray.get(i);
        }

        return result;
    }
}
