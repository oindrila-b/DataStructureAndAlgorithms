package main.java.LeetCode.Arrays.HashSetDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashSet {

    private final List<Integer> hashSetList;
    public MyHashSet() {
        hashSetList = new ArrayList<>((int) Math.pow(10,6));
    }

    public void add(int key) {
      if (!hashSetList.contains(key)) hashSetList.add(key);
    }

    public void remove(int key) {
    if (hashSetList.contains(key)){
        int i = hashSetList.indexOf(key);
        hashSetList.remove(i);
    }
    }

    public boolean contains(int key) {
        return hashSetList.contains(key);
    }

    @Override
    public String toString() {
        return "My HashSet = " + Arrays.toString(hashSetList.toArray());
    }
}
