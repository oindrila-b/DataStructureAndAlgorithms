package main.java.LeetCode.Arrays.FindDifference;

import java.util.*;
import java.util.stream.Collectors;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> copy = new HashSet<>(set1);

        set1.removeAll(set2);
        System.out.println(set1);
        set2.removeAll(copy);
        System.out.println(set2);

        List<Integer> l1 = new ArrayList<>(set1);
        List<Integer> l2 = new ArrayList<>(set2);

        list.add(l1);
        list.add(l2);
        return list;
    }
}
