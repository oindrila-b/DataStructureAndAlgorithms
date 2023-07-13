package main.java.LeetCode.Strings.AToIString;

public class Main {
    public static void main(String[] args) {
        AToI aToI = new AToI();
        System.out.println(aToI.myAtoi("  42"));
        System.out.println(aToI.myAtoi("   -42  hey"));
        System.out.println(aToI.myAtoi("4193 with words"));
        System.out.println(aToI.myAtoi("hello there 4193 with words"));
    }

}
