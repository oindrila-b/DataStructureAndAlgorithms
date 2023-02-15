package main.java.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
