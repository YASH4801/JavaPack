package org.practice.java.com.LeetCode.Solutions;

import java.util.*;

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxResult = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    maxResult = Math.max(maxResult, checkMax(nums, i, j, k));
                }
            }
        }
        return maxResult;
    }

    private long checkMax(int[] nums, int i, int j, int k) {
        return (long) (nums[i] - nums[j]) * nums[k];
    }
}



