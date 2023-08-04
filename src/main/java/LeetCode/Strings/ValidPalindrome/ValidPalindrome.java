package main.java.LeetCode.Strings.ValidPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int stringLength = s.length();
        char[] sArray = s.toCharArray();
        int i = 0;
        int j = stringLength-1;

        while (i < j ){
            if (sArray[i++] != sArray[j--]){
                return false;
            }
        }
        return true;
    }
}
