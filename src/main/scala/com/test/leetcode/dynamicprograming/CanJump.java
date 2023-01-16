package com.test.leetcode.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class CanJump {
    //55.跳跃游戏
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        dp[0] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && nums[j] + j >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[nums.length];
    }
}
