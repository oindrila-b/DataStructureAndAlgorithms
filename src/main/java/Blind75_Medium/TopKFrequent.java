package main.java.Blind75_Medium;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet()); // this has a list of entries as is a list of [1=3, 2=4...]
        entryList.sort( // we now want to sort the array based on the value
                new Comparator<Map.Entry<Integer, Integer>>() // we initialise a comparator that going to compare values of type Map.Entry
                {
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) { // compare two entry values
                return entry2.getValue().compareTo(entry1.getValue()); // if value1 > value 2, return value 1 else 2
            }
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }

        return ans;

    }
public static void main(String[] args) {
//    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//    queue.add(20);
//    queue.add(10);
//    queue.add(2);
//    queue.add(50);
//
//    System.out.println(queue);

    TopKFrequent topKFrequent = new TopKFrequent();
    System.out.println(Arrays.toString(topKFrequent.topKFrequent(new int[]{1, 2, 3, 4, 4, 5, 5, 5, 5, 9, 9, 9, 102, 102, 102, 102, 102}, 2)));
}
}
