package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        sum(3, 0);
        System.out.println(sum(3));
    }

    // parameterised
    public static void sum(int n,  int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum(n-1, sum+n);
    }

    public static int sum(int n){
        if ( n == 1) return  1;
        return n + sum(n-1);
    }

}
