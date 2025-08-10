package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LC2948MLSAbySE {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        List<Map<Integer, Integer>> finalList = new ArrayList<>();
        TreeMap<Integer, Integer> result = new TreeMap<>();
        Map.Entry<Integer, Integer> previous = null;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (previous == null) {
                previous = e;
                result.put(e.getKey(), e.getValue());
                continue;
            }
            if (e.getKey() - previous.getValue() <= limit) {
                result.put(e.getKey(), e.getValue());
                previous = e;
            } else {
                finalList.add(new TreeMap<>(result));
                result.clear();
                result.put(e.getKey(), e.getValue());
                previous = e;
            }
        }
        finalList.add(new TreeMap<>(result));
        finalList.forEach( imap -> {
            perform(imap, nums);
        });
        return nums;
    }

    private void perform(Map<Integer, Integer> map, int[] nums) {
        var sortedIndices = map.values().stream().sorted().toList();
        var keySet = map.keySet().stream().toList();
        for (int i = 0; i < map.size(); i++) {
            nums[sortedIndices.get(i)] = keySet.get(i);
        }
    }
}
