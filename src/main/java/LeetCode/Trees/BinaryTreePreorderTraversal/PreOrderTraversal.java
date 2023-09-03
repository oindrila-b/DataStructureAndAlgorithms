package main.java.LeetCode.Trees.BinaryTreePreorderTraversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    List<Integer> treeElements = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return treeElements;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;;

        treeElements.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
