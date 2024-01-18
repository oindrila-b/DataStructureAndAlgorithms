package main.java.LeetCode.Trees.MaxTreeDepth;

import main.java.LeetCode.Trees.TreeNode;

public class MaxTreeDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) +1;
    }

}
