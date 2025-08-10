package org.practice.java.com.LeetCode.Solutions;

public class LC1524AccumulativeSum {
//    public int maxAbsoluteSum(int[] nums) {
//        int maxSum = kadenSum(nums);
//        for ( int i = 0; i < nums.length; i++) {
//            nums[i] = -nums[i];
//        }
//        int minsum = kadenSum(nums);
//        return Math.max(maxSum, Math.abs(minsum));
//    }

    public int maxAbsoluteSum(int[] nums) {
        int currsum = 0;
        int minSum = 0;
        int maxSum = 0;
        for (int num : nums) {
            currsum += num;
            minSum = Math.min(minSum, currsum);
            maxSum = Math.max(maxSum, currsum);
        }
        return maxSum - minSum;
    }

    private int kadenSum(int[] nums) {
        int maxSum = 0;
        var currSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        LC1524AccumulativeSum solution = new LC1524AccumulativeSum();
        int[] nums = {-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9};
        System.out.println(solution.maxAbsoluteSum(nums)); // Output: 6
    }
}
