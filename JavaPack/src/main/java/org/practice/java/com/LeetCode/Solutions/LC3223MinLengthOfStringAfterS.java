package org.practice.java.com.LeetCode.Solutions;

import static java.lang.Math.abs;

public class LC3223MinLengthOfStringAfterS {
    public int minChanges(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[k+1];
        for (int i = 0; i < n /2; i++) {
            int r = Math.abs(nums[i] - nums[n-i-1]);
            arr[r]++;
        }
        int max = 0;
        int oldmax = 0;
        int max_idx = 0;
        for (int i = 0; i < arr.length; i++) {
            oldmax = max;
            max = Math.max(max, arr[i]);
            if (max != oldmax) {
                max_idx = i;
            }
        }
        return n/2 - max;
    }

    public static void main(String[] args) {
        LC3223MinLengthOfStringAfterS lc = new LC3223MinLengthOfStringAfterS();
        int[] nums = {18,10,14,18,17,2,11,5};
        int k = 19;
        System.out.println(lc.minChanges(nums, k)); // Output: 4
    }
}
