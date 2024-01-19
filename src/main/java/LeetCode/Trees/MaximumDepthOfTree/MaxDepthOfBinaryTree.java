package main.java.LeetCode.Trees.MaximumDepthOfTree;

import main.java.LeetCode.Trees.TreeNode;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            int left =maxDepth( root.left);
            int right = maxDepth(root.right);

            return Math.max(left,right) +1;
    }
}
