package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class RecursionConcept {

    private static int count  = 0;
    public static void main(String[] args) {
        printFunction();
    }

    public static void printFunction(){
        if (count == 3) return;
        System.out.println(count);
        count++;
        printFunction();
    }
}
