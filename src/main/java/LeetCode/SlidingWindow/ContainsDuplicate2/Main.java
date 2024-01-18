package main.java.LeetCode.SlidingWindow.ContainsDuplicate2;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate2 containsDuplicate2 = new ContainsDuplicate2();
        System.out.println( containsDuplicate2.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println( containsDuplicate2.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println( containsDuplicate2.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}
