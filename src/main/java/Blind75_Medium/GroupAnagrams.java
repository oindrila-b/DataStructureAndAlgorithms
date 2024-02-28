package main.java.Blind75_Medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> wordIndexMap = new HashMap<>();
        for (String s: strs) {
           char arr[] = s.toCharArray();
           Arrays.sort(arr);
           String word = new String(arr);

           if (!wordIndexMap.containsKey(word)){
               wordIndexMap.put(word, new ArrayList<>());
           }
           wordIndexMap.get(word).add(s);
        }
        return new ArrayList<>(wordIndexMap.values());
    }


}
