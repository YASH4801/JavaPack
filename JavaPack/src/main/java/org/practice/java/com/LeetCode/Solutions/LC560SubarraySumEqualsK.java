package org.practice.java.com.LeetCode.Solutions;

import java.util.*;


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
    public static void main(String[] args) {
        Solutions tasks = new Solutions();
//        System.out.println(tasks.check(new int[]{3, 4, 5, 1, 2})); // Output: true
    }
}

class Solutions {
    public boolean check(int[] nums) {
        var checker = new ArrayList<Integer>();
        addAll(checker, nums);
        Arrays.sort(nums);
        var res = new ArrayList<Integer>();
        addAll(res, nums);
        for (int i = 0; i < checker.size(); i++) {
            var retainer  = checker.removeFirst();
            checker.add(retainer);
            if (checker.equals(res)) {
                return true;
            }
        }
        return false;
    }
    private void addAll(ArrayList<Integer> list, int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
    }

}
