package main.java.LeetCode.Graphs.CloneGraphs;

import main.java.LeetCode.Graphs.Node;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> copyMap = new HashMap<>();
        return cloneGraph(node, copyMap);
    }

    private Node cloneGraph(Node node, Map<Integer, Node> copyMap) {
        if (copyMap.containsKey(node.val)) return copyMap.get(node.val);
        Node copy = new Node(node.val);
        copyMap.put(node.val, copy);
        for(Node neighbor : node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbor, copyMap));
        }
        return copy;
    }
}
