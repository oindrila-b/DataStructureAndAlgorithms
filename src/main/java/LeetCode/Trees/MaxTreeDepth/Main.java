package main.java.LeetCode.Trees.MaxTreeDepth;

import main.java.LeetCode.Trees.TreeNode;

public class Main {
    public static void main(String[] args) {
        // Left of root
        TreeNode rootChildLeft = new TreeNode(9, null, null);
        //Right of root
        TreeNode rootGrandChildRight = new TreeNode(7, null, null);
        TreeNode rootGrandChildLef = new TreeNode(15, null, null);
        TreeNode rootChildRight = new TreeNode(20, rootGrandChildLef, rootGrandChildRight);
        TreeNode root = new TreeNode(3, rootChildLeft, rootChildRight);

        MaxTreeDepth depth =  new MaxTreeDepth();
        System.out.println(depth.maxDepth(root));

        TreeNode rootChildRight2 = new TreeNode(2, null, null);
        TreeNode root2 = new TreeNode(1, null, rootChildRight2);

        System.out.println(depth.maxDepth(root2));

        TreeNode treeNode3 =  new TreeNode(0, null, null);
        System.out.println(depth.maxDepth(treeNode3));

        TreeNode treeNode4 =  new TreeNode();
        System.out.println(depth.maxDepth(treeNode4));

    }
}
