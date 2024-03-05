package main.java.LeetCode.PriorityQueue.LastStoneWeight;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        for (int stone : stones) {
            maxHeap.offer(stone);

        }
        System.out.println(maxHeap);

        while (maxHeap.size() > 1) {
            int element1 = maxHeap.poll();
            int element2 = maxHeap.poll();
            int result = Math.abs(element2 - element1);
            maxHeap.offer(result);
        }

        System.out.println(maxHeap);

        return  maxHeap.poll();
    }
}
