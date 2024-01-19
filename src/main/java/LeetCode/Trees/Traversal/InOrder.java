package main.java.LeetCode.Trees.Traversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    List<Integer> numbers = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root!= null) {
            traverse(root);
        }
        return numbers;
    }

    public void traverse(TreeNode treeNode) {
            if (treeNode == null) return;
            traverse(treeNode.left);
            numbers.add(treeNode.val);
            traverse(treeNode.right);
    }
}
