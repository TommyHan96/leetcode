package com.test.leetcode.graph.dfs;

public class PathSum3 {

    static class TreeNode {
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

    //双重递归解法
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        int ret = rootSum(root, targetSum);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);

        return ret;
    }

    public int rootSum(TreeNode root, int targetSum){
        int ret = 0;
        if (root == null)
            return 0;

        targetSum -= root.val;

        if (targetSum == 0)
            ret++;

        ret += rootSum(root.left, targetSum);
        ret += rootSum(root.right, targetSum);

        return ret;
    }


}
