package main.java.LeetCode.Trees.DiameterOfTree;

import main.java.LeetCode.Trees.TreeNode;

public class DiameterOfATree {
    int count = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null || root.right == null) return 1;
        return diameterOfBinaryTree(root.left) + diameterOfBinaryTree(root.right);
    }
}
