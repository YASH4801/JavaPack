package org.practice.java.com.LeetCode.Solutions;

import java.util.HashMap;
import java.util.Map;


public class LC560SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentsum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];
            if (prefixSumMap.containsKey(currentsum - k)) {
                count += prefixSumMap.get(currentsum - k);
            }

            prefixSumMap.put(currentsum, prefixSumMap.getOrDefault(currentsum, 0) + 1);  // update the count for current sum
        }

        return count;
    }
}
