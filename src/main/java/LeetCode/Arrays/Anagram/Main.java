package main.java.LeetCode.Arrays.Anagram;

public class Main {
    public static void main(String[] args) {
        Anagram anagram =  new Anagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
        System.out.println(anagram.isAnagram("rat", "car"));
        System.out.println(anagram.isAnagram("a", "b"));
    }
}
