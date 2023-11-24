package main.java.LeetCode.Arrays.DivideTwoIntegers;

public class Main {
    public static void main(String[] args) {
        DivideIntegers divideIntegers = new DivideIntegers();

        System.out.println(  divideIntegers.divide(10, 3));
        System.out.println( divideIntegers.divide(7, -3));
        System.out.println( divideIntegers.divide(-1, 1));
        System.out.println( divideIntegers.divide(-1, -1));
        System.out.println( divideIntegers.divide(-2147483648, -1));
        System.out.println( divideIntegers.divide(2147483647, -1));
    }
}
