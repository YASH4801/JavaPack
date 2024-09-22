package org.practice.java.com.LeetCode.Solutions;

import java.util.HashMap;
import java.util.Map;

public class LC525ContinousSubarray {

    public int findMaxLength(int[] nums) {

        int maxLength = 0;

        int prefixSum = 0;

        Map<Integer, Integer> memoryMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {

            prefixSum += nums[i] == 0 ? -1 : 1;

            if (prefixSum == 0) {
                maxLength = maxLength < i + 1 ? i + 1 : maxLength;
            } else if (memoryMap.containsKey(Integer.valueOf(prefixSum))) {
                maxLength = checkForMaxLength(memoryMap.get(Integer.valueOf(prefixSum)), i, maxLength);
            } else {
                memoryMap.put(Integer.valueOf(prefixSum), i);
            }
        }

        return maxLength;
    }

    private int checkForMaxLength(int start, int end, int maxLength) {
        if (maxLength < (end - start)) {
            return end - start;
        }
        return maxLength;
    }
}
