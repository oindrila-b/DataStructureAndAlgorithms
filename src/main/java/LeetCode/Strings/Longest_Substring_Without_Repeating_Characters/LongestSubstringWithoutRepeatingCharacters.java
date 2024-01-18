package main.java.LeetCode.Strings.Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> substring = new HashSet<>();

        int start = 0;
        int end  = 0;
        int max = 0;

        while(end < s.length()) {
            if (!substring.contains(s.charAt(end))){
                substring.add(s.charAt(end));
                end++;
                max = Math.max(substring.size(), max);
            }else {
                substring.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
