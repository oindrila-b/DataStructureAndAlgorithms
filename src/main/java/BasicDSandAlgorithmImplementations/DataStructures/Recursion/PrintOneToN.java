package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class PrintOneToN {

    public static int N = 6;
    public static int ITERATOR=1;
    public static void main(String[] args) {
    printNumber();
    }

    public static void printNumber(){
        if (ITERATOR > N) return;
        System.out.println(ITERATOR);
        ITERATOR++;
        printNumber();
    }
}
