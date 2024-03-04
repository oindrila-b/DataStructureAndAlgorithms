package main.java.LeetCode.PriorityQueue.KthLargestElementInStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthLargestElementInStream {

    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        for (var n : nums) add(n);

    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) heap.poll();
        return heap.peek();
    }
}


 class Main {
    public static void main(String[] args) {
        KthLargestElementInStream kthLargestElementInStream = new KthLargestElementInStream(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargestElementInStream.add(3));
        System.out.println(kthLargestElementInStream.add(5));
        System.out.println(kthLargestElementInStream.add(10));
        System.out.println(kthLargestElementInStream.add(9));
        System.out.println(kthLargestElementInStream.add(4));
    }
}
