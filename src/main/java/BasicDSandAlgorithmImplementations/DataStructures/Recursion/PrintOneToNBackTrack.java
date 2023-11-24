package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class PrintOneToNBackTrack {

    public static void print(int n, int n1) {
        if (n < 1) return;
        print(n-1, n1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(3,3);
    }

}
