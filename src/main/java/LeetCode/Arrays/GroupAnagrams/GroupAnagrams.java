package main.java.LeetCode.Arrays.GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> wordMap = new HashMap<>();

        for (String s:strs) {
            char arr[] =s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);

            if (!wordMap.containsKey(word)) {
                wordMap.put(word, new ArrayList<>());
            }
            wordMap.get(word).add(s);
        }

        return new ArrayList<>(wordMap.values());

    }
}
