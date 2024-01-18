package main.java.LeetCode.Strings.LengthOfLastWord;

public class FirstIndexInString {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return index;
    }
}
