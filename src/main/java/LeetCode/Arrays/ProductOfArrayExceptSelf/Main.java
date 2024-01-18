package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int[] answer = product.productExceptSelf(new int[] {1,2,3,4});
        for (int n: answer) {
            System.out.println(n);
        }
    }
}
