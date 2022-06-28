package com.test.leetcode.backtrack;

import java.util.HashMap;
import java.util.Map;

public class PathSum3 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> prefix = new HashMap<Integer, Integer>();
        prefix.put(0,1);
        return recursionPathSum(root, prefix, targetSum, 0);
    }

    public int recursionPathSum(TreeNode node, Map<Integer, Integer> prefix, int target, int currSum) {
        if (node == null)
            return 0;

        int ret = 0;

        currSum += node.val;

        ret += prefix.getOrDefault(currSum - target, 0);
        prefix.put(currSum, prefix.getOrDefault(currSum, 0) + 1);

        ret += recursionPathSum(node.left, prefix, target, currSum);
        ret += recursionPathSum(node.right, prefix, target, currSum);

        prefix.put(currSum, prefix.get(currSum) - 1);
        return ret;
    }


}
