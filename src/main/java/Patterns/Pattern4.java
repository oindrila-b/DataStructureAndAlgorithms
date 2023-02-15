package main.java.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
    printTriangle(5);
    }
    public static void printTriangle(int num) {
        int k = 1;
        for (int i =0 ; i< num;i ++){
            for (int j = 0; j<=i; j++) {
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
    }
}
