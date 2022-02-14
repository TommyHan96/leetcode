package com.test.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {
    public class TreeNode {
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

    Map<Integer, Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indexMap = new HashMap<>();
        for (int i = 0; i <= inorder.length - 1; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length -1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight)
            return null;

        int preRoot = preLeft;
        int inRoot = indexMap.get(preorder[preRoot]);
        TreeNode root = new TreeNode(preorder[preRoot]);
        int len = inRoot - inLeft;

        //边界条件
        root.left = buildTree(preorder, inorder, preLeft + 1 , preLeft  + len, inLeft, inRoot - 1);
        root.right = buildTree(preorder, inorder, preLeft + 1 + len, preRight, inRoot + 1, inRight);
        return root;
    }
}
