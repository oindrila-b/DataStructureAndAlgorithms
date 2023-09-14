package main.java.LeetCode.Trees.InverseATree;

import main.java.LeetCode.Trees.TreeNode;

public class InverseTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
