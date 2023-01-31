package com.test.leetcode.dynamicprograming;

public class CanPartition {
    //416. 分割等和子集
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[10001];


        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }

        for (int d = 0; d <= 40; d++) {
            System.out.println(dp[d]);
        }
        return dp[target] == target;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        for (int num : nums) {
            num = 1;
        }
        System.out.println(canPartition(nums));
    }
    // [1, 5, 5, 11]
}
