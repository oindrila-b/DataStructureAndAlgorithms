package main.java.LeetCode.Arrays.K_Frequent_Element;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class KFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequentElementMap = new HashMap<>();
        List<Integer> frequentElementList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (frequentElementMap.containsKey(nums[i])) {
                int freq = frequentElementMap.get(nums[i]);
                frequentElementMap.put(nums[i], (++freq));
            } else {
                frequentElementMap.put(nums[i], 1);
            }
        }

        AtomicInteger c = new AtomicInteger(0);
        frequentElementMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(ele -> {
            if (c.getAndIncrement() < k) {
                frequentElementList.add(ele.getKey());

            }
        });

        return frequentElementList.stream().mapToInt(i -> i).toArray();
    }
}


// #BETTER

/*****
 * class Solution {
 *     public int[] topKFrequent(int[] nums, int k) {
 *
 *         //HashMap and heap method.
 *         //O(Nlogk) time if k < N, O(N) if k = N.
 *         //O(N + k) space.
 *
 *         //if (k == nums.length) return nums;
 *
 *         HashMap<Integer, Integer> freq = new HashMap<>();
 *
 *         for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
 *
 *         Queue<Integer> heap = new PriorityQueue<>((n1, n2) ->
 *             Integer.compare(freq.get(n1), freq.get(n2)));
 *
 *         for (int n : freq.keySet()) {
 *             heap.add(n);
 *             if (heap.size() > k) heap.poll();
 *         }
 *
 *         int[] res = new int[k];
 *         for (int i = k - 1; i >= 0; i--) res[i] = heap.poll();
 *         return res;
 *     }
 * }
 *
 * */