package main.java.LeetCode.Strings.Longest_Palindromic;

public class LongestPalindromic {

    public static String longestPalindrome(String s) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder storeLongestPalindrome = new StringBuilder();
        StringBuilder longestPalindrome = new StringBuilder();

        for (char c : s.toCharArray()) {
            longestPalindrome.append(c);
            reverse.append(c);
            reverse.reverse();
            System.out.println("Longest Palindrome : " + longestPalindrome);
            System.out.println("Reverse Palindrome : " + reverse);
            boolean isPalindrome = checkPalindrome(longestPalindrome, reverse);
            reverse.reverse();
            System.out.println("Reverse Palindrome : " + reverse);
            if (isPalindrome) {
                if (storeLongestPalindrome.length() < longestPalindrome.length()) {
                    storeLongestPalindrome = new StringBuilder(longestPalindrome);
                }
            }
        }
         return storeLongestPalindrome.toString();
    }

    public static boolean checkPalindrome(StringBuilder word, StringBuilder reverse) {
        boolean isPalindrome = false;
        if (word.compareTo(reverse) == 0) {
            isPalindrome = true;
            System.out.println(isPalindrome);
        }
        return isPalindrome;
    }


    public static void main(String[] args) {
        System.out.println( LongestPalindromic.longestPalindrome("babad"));
        System.out.println( LongestPalindromic.longestPalindrome("ababadd"));

    }

}
