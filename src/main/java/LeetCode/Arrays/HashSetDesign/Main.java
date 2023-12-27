package main.java.LeetCode.Arrays.HashSetDesign;

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        System.out.println(myHashSet);
        myHashSet.add(2);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));
        myHashSet.add(2);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(2));
        System.out.println(myHashSet);
        myHashSet.remove(2);
        System.out.println(myHashSet);
        myHashSet.contains(2);
    }
}
