package main.java.LeetCode.Arrays.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductOfSelfOptimized product = new ProductOfSelfOptimized();

        System.out.println(Arrays.toString(product.productExceptSelf(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(product.productExceptSelf(new int[] {-1,1,0,-3,3})));
    }
}
