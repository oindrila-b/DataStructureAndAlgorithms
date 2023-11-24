package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class PrintNToOneBackTrack {

    public static void print(int n1, int n2) {
        if (n1 > n2) return;
        print(n1 +1, n2);
        System.out.println(n1);
    }

    public static void main(String[] args) {
        print(1,3);
    }

}
