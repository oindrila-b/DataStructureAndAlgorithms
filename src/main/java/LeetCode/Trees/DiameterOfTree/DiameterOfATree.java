package main.java.LeetCode.Trees.DiameterOfTree;

import main.java.LeetCode.Trees.TreeNode;

public class DiameterOfATree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null )return 0;
        if (root.left == null && root.right == null) return 0;
        height(root);
        return diameter;
    }

    public int height(TreeNode node) {
        if (node == null) return -1;

        int left = height(node.left);
        int right = height(node.right);

        diameter =  Math.max(diameter, left+right+2); // we add a 2 ,because from the left subtree to the right subtree we'll have a root node
        // left subtree to root node distance = 1 and root node to right subtree distance = 1 , therefore +2

        return 1 + Math.max(left, right);
    }
}
