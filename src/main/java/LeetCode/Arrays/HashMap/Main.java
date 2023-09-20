package main.java.LeetCode.Arrays.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(3, 85);
        System.out.println(hashMap.get(3));
        hashMap.remove(3);
        System.out.println(hashMap.get(3));
    }
}
