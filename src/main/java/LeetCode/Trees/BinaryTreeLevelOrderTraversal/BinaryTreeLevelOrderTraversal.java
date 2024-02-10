package main.java.LeetCode.Trees.BinaryTreeLevelOrderTraversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> nodeList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        setNodes(root, 0);
        return nodeList;
    }

    public void setNodes(TreeNode node, int level) {
        if (node == null) return;
        if (nodeList.size() == level) {
            nodeList.add(level, new ArrayList<>());
        }

        nodeList.get(level).add(node.val);
        setNodes(node.left, level+1);
        setNodes(node.right, level+1);
    }

}
