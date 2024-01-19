package main.java.LeetCode.Trees.InvertTree;

import main.java.LeetCode.Trees.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    public TreeNode invert(TreeNode root) {
        if (root == null) return null;
        invert(root.left);
        invert(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
