package main.java.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int num) {
        int k = num;
        for (int i =0 ; i< num;i ++){
            for (int j = 0; j < k; j ++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }
    }
}
