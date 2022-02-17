package com.test.leetcode.tree;

public class InvertTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return invert(root);
    }

    TreeNode invert(TreeNode node){
        if (node == null)
            return null;
        invert(node.left);
        invert(node.right);
        TreeNode tmp = node.right;
        node.right = node.left;
        node.left = tmp;
        return node;
    }

}
