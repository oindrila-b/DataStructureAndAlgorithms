package main.java.LeetCode.Arrays.IsSequence;

public class IsSequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0 ;
        int j = 0;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        while(i<s.length() && j< t.length()){
            if (sChar[i] == tChar[j]){
                i++;
            }
            j++;
        }
        if (i ==s.length()){
            return true;
        }else {
            return false;
        }
    }
}
