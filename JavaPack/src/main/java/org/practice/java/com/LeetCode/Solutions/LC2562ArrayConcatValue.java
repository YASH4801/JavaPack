package org.practice.java.com.LeetCode.Solutions;

public class LC2562ArrayConcatValue {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int l = 0;
        int r = nums.length - 1;
        while (r >= l) {
            if (r == l) {
                sum += nums[r];
            } else {
                sum += calculateConcatVal(String.valueOf(nums[l]), String.valueOf(nums[r]));
            }
            r--;
            l++;
        }
        return sum;
    }
    private long calculateConcatVal(String start, String end) {
        return Long.parseLong(start + end);
    }
}
