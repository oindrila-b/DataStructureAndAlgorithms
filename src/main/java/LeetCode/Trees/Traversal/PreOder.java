package main.java.LeetCode.Trees.Traversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOder {
    List<Integer> numbers = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            traverse(root);
        }

        return numbers;
    }

    public void traverse(TreeNode node) {
        if (node == null) return;
        numbers.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }

}
