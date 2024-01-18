package main.java.LeetCode.Arrays.WordPattern;

public class Main {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("aaba", "dog cat"));
        System.out.println(wordPattern.wordPattern("abba", "dog dog dog dog"));

    }
}
