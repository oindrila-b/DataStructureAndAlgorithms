package main.java.LeetCode.Trees.PostOrderTraversal;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    List<Integer> nodeElements = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
    traverse(root);
    return nodeElements;
    }

    public void traverse(TreeNode node){
        if (node == null) return;
        traverse(node.left);
        traverse(node.right);
        nodeElements.add(node.val);
    }
}
