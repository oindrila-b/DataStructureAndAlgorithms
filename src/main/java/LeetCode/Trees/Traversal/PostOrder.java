package main.java.LeetCode.Trees.Traversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    List<Integer> numbers = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            traverse(root);
        }

        return numbers;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        traverse(root.right);
        numbers.add(root.val);
    }
}
