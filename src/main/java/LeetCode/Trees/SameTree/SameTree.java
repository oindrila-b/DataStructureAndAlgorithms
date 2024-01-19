package main.java.LeetCode.Trees.SameTree;

import main.java.LeetCode.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
