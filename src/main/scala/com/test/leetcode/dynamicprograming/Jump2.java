package com.test.leetcode.dynamicprograming;

public class Jump2 {
    //45. 跳跃游戏 II
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = nums.length + 1;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] + j >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[nums.length - 1];
    }
}
