package main.java.LeetCode.TwoPointer.CommonSmallest;

public class Main {
    public static void main(String[] args) {
        CommonSmallest cs = new CommonSmallest();
        System.out.println(cs.getCommon(new int[] {1,2,3}, new int[]{2,4}));
        System.out.println(cs.getCommon(new int[] {1,2,3,6}, new int[]{2,3,4,5}));
        System.out.println(cs.getCommon(new int[] {100, 200, 300}, new int[]{50, 100, 150, 200}));
        System.out.println(cs.getCommon(new int[] {2, 4, 6, 8, 10}, new int[]{1, 3, 5, 7, 9}));
    }
}
