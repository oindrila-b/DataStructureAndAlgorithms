package main.java.LeetCode.Arrays.ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int num[] = {1,2,3,9,1,4};
        System.out.println(containsDuplicate.containsDuplicate(num));

        int num_2[] = {1,2,3,9,8,4};
        System.out.println(containsDuplicate.containsDuplicate(num_2));
    }
}
