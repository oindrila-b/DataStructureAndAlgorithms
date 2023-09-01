package main.java.LeetCode.Trees.BinaryTreeInorderTraversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> treeElementList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return treeElementList;
    }

    public void  traverse(TreeNode root) {
        if (root==null) return;
        traverse(root.left);
        treeElementList.add(root.val);
        traverse(root.right);
    }
}
