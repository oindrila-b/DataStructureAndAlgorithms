package main.java.LeetCode.Strings.RepeatedSubtringPattern;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubstringPattern {

    /**
     * if s = abab
     * add the string to itself s+s = abababab
     * delete the starting and ending character => bababa
     *  if s is a substring of this new string then return true else false.
     *  Notice that s is only a substring if the strings are same
     * **/
    public boolean repeatedSubstringPattern(String s) {

        String sub = s+s;
        String substring = sub.substring(1,sub.length()-1);
        if (substring.contains(s)) return true;
        return false;

    }
}
