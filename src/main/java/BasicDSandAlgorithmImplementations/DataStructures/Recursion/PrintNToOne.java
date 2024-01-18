package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class PrintNToOne {
    public static int N = 6;
    public static int ITERATOR=1;
    public static void main(String[] args) {
        printNumber();
    }
    public static void printNumber(){
        if (N < ITERATOR) return;
        System.out.println(N);
        N--;
        printNumber();
    }
}
