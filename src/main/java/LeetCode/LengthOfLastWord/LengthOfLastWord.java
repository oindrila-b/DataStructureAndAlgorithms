package main.java.LeetCode.LengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int indexOfLastWhiteSpace = temp.lastIndexOf(32);
        String lastWord = temp.substring(indexOfLastWhiteSpace+1);
        System.out.println(lastWord);
        return lastWord.length();
    }
}
