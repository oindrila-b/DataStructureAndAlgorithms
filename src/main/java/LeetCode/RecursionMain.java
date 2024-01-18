package main.java.LeetCode;

public class RecursionMain {
    public static void main(String[] args) {
        int i = 0;
        function(i);
    }
    public static void function (int i) {
        System.out.println("Value " + (i+1) +" is " + 1);
        i++;
        if (i < 5) {
            function(i);
        }
    }
}
