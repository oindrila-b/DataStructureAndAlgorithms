package main.java.LeetCode.Strings.ReverseAString;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();

        char[] s = {'h','e','l','l','o'};
        System.out.println(s);

        reverse.reverseString(s);
        System.out.println(s);
    }
}
