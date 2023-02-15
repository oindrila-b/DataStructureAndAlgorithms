package main.java.LeetCode.Arrays.Plus_One;

import java.math.BigInteger;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < n; i++) {
//            if (digits[i] == 0) {
//               long sumLong = sum;
//                System.out.println(sumLong);
//                sumLong = sumLong*10;
//                System.out.println(sumLong);
//                sum = (int) sumLong;
//            } else {
                sum = (sum.multiply(BigInteger.TEN)).add(BigInteger.valueOf(digits[i])) ;
                System.out.println(sum);
         //   }
        }
        System.out.println(sum);

        sum = sum.add(BigInteger.ONE);

        System.out.println(sum);

        String temp = String.valueOf(sum);

        int resultArray[] = new int[temp.length()];

        for (int i =0; i<temp.length(); i++) {
            int num = Character.getNumericValue(temp.charAt(i));
            resultArray[i] = num;
        }


        return resultArray;
    }
}
