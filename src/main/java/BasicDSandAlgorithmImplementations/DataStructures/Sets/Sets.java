package main.java.BasicDSandAlgorithmImplementations.DataStructures.Sets;

import java.util.HashSet;
import java.util.Set;

// The ordering of elements in a set is unordered
public class Sets {
    public static void main(String[] args) {
        Set<String> hashStringSet = new HashSet<>();
        hashStringSet.add("India");
        hashStringSet.add("Australia");
        hashStringSet.add("South Africa");

        hashStringSet.add("America");
      //  hashStringSet.add("India");

        System.out.println(hashStringSet);

        hashStringSet.remove("Australia");

        System.out.println(hashStringSet);
    }
}
