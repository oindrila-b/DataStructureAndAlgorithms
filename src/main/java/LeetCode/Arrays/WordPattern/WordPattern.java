package main.java.LeetCode.Arrays.WordPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> wordAssociationMap = new HashMap<>();
        char[] characterAssociationArray = pattern.toCharArray();
        String[] words = s.split(" ");
        if (characterAssociationArray.length != words.length) return false;
        for (int i = 0; i < characterAssociationArray.length; i++) {
            if (!wordAssociationMap.containsKey(characterAssociationArray[i]) && !wordAssociationMap.containsValue(words[i])) {
                wordAssociationMap.put(characterAssociationArray[i], words[i]);
            } else if (!wordAssociationMap.containsKey(characterAssociationArray[i]) && wordAssociationMap.containsValue(words[i])){
               return false;
            } else{
                String word = wordAssociationMap.get(characterAssociationArray[i]);
                if (!word.equals(words[i])) return false;
            }
        }
        return true;
    }
}
