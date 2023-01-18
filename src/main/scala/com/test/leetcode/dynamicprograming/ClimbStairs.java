package com.test.leetcode.dynamicprograming;

public class ClimbStairs {
    //70.爬楼梯
    public int climbStairs(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
