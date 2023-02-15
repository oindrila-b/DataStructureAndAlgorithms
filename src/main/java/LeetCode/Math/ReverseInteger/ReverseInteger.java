package main.java.LeetCode.Math.ReverseInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-321));
        System.out.println(reverse(-120));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}
