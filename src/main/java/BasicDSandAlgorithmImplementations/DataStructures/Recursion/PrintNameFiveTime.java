package main.java.BasicDSandAlgorithmImplementations.DataStructures.Recursion;

public class PrintNameFiveTime {

    private static final String NAME = "Oindrila";
    private static int NAME_COUNT = 0;

    public static void main(String[] args) {
        printName();
    }

    private static void printName() {
        if (NAME_COUNT == 5) return;
        System.out.println(NAME);
        NAME_COUNT++;
        printName();
    }
}
