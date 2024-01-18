package main.java.LeetCode.Arrays.MaxNumberOfBalloons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {

        Map<String, Integer> wordCountMap = new HashMap<>(Map.of("b", 0, "a", 0, "l", 0, "o", 0, "n", 0));
        Map<String, Integer> reqMap = new HashMap<>(Map.of("b", 1,"a", 1, "l", 2, "o", 2, "n", 1));
        for(Character c : text.toCharArray()){
            if (wordCountMap.containsKey(c.toString())) {
                int freq = wordCountMap.get(c.toString());
                wordCountMap.put(c.toString(), (++freq));
            }
        }

        if (wordCountMap.containsValue(0)) return 0;
        System.out.println(wordCountMap);
            int instant = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            instant = Math.min(instant, (entry.getValue()/reqMap.get(entry.getKey())));
        }
        return instant;
    }
}
