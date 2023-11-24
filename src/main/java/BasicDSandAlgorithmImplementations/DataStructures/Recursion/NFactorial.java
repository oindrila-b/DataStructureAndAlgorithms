package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class NFactorial {

    public static void main(String[] args) {
        System.out.println(   factorial(4));
        factorial(4, 1);

    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void factorial(int n, int fact) {
        if (n < 1) {
            System.out.println(fact);
            return;
        }
        factorial(n-1, fact*n);
    }

}
