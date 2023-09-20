package main.java.LeetCode.TwoPointer.RemoveDuplicates2;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
    int[] myArray = new int[] {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicate.removeDuplicates(myArray));

        int[] myArray2 = new int[] {1,1,1,2,2,3};
        System.out.println(removeDuplicate.removeDuplicates(myArray2));

        int[] myArray3 = new int[] {0,0,0,1,1,1,2,2,2,3,3,3,4,5,6,7};
        System.out.println(removeDuplicate.removeDuplicates(myArray3));

        int[] myArray4 = new int[] {0,0,0,1,1,1,2,2,2,3,3,3,4,5,6,7,7,7};
        System.out.println(removeDuplicate.removeDuplicates(myArray4));
    }
}
