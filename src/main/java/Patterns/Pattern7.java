package main.java.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int num) {
        for (int i = 0; i < num; i++) {
                for (int k = 0; k < ((i*2) + 1); k++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
