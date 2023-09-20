package main.java.LeetCode.Arrays.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HashMap {

    private List<Integer> keyAndValueArray;

    public HashMap() {
        keyAndValueArray = new ArrayList<>();
        Collections.fill(keyAndValueArray, -1);
    }

    public void put(int key, int value) {
        keyAndValueArray.add(key, value);
    }

    public int get(int key) {
        return  keyAndValueArray.get(key);
    }

    public void remove(int key) {
        keyAndValueArray.add(key, -1);
    }
}
