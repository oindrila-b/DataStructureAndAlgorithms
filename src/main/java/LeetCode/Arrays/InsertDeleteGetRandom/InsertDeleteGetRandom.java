package main.java.LeetCode.Arrays.InsertDeleteGetRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public InsertDeleteGetRandom() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> locs;
  Random rand = new Random();
    public boolean insert(int val) {
        boolean contain = locs.containsKey(val);
        if ( contain ) return false;
        locs.put( val, nums.size());
        nums.add(val);
        return true;
    }


    public boolean remove(int val) {
        boolean contain = locs.containsKey(val);
        if ( ! contain ) return false;
        int loc = locs.get(val);
        if (loc < nums.size() - 1 ) {
            int lastone = nums.get(nums.size() - 1 );
            nums.set( loc , lastone );
            locs.put(lastone, loc);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }


    public int getRandom() {
        return nums.get( rand.nextInt(nums.size()) );
    }
}
