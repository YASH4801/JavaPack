package org.practice.java.com.LeetCode.Solutions;

import java.util.Arrays;

public class TestOne {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        long sum = getSum(candies);
        if (sum < k) { return 0; }
        int l = 0, r = candies[candies.length - 1];
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canBeDivided(candies, k, mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return r;
    }
    private long getSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private boolean canBeDivided(int[] candies, long k, int mid) {
        long sum = 0;
        for (int i = 0; i < candies.length; i++) {
            sum += candies[i] / mid;
        }
        if (sum >= k) {
            return true;
        }
        return false;
    }
}
