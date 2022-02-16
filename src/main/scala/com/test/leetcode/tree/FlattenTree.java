package com.test.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class FlattenTree {
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

    //114.二叉树展开为链表
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        helper(root, arr);
        for (int i = 0; i < arr.size(); i++){
            TreeNode prev = arr.get(i - 1);
            TreeNode cur = arr.get(i);
            prev.left = null;
            prev.right = cur;
        }

    }

    List<TreeNode> helper(TreeNode node, ArrayList<TreeNode> results){
        if (node != null) {
            results.add(node);
            helper(node.left, results);
            helper(node.right, results);
        }
        return results;
    }
}
