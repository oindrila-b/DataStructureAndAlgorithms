package main.java.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
    printSquare(5);
    }

    public static void printSquare(int n){

      for (int i =0; i < n; i++) {
          for (int j =0; j < n; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

    }
}
