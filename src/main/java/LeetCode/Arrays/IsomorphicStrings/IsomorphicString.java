package main.java.LeetCode.Arrays.IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if (sChar.length != tChar.length) return false;

        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < sChar.length; i++) {
            if ((characterMap.containsKey(sChar[i]) && (characterMap.get(sChar[i]) != tChar[i]))
            || (!characterMap.containsKey(sChar[i]) && characterMap.containsValue(t.charAt(i)))){
                return false;
            } else {
                characterMap.put(sChar[i], tChar[i]);
            }
        }
        return true;
    }
}
