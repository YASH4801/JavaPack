package org.practice.java.com.LeetCode.Solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class LC2342MaxDigitSum {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer[]> memory = new HashMap<>();
        Arrays.sort((nums));
        reverse(nums);
        for (int n : nums) {
            var sum = getSumOfDigits(n);
            var memList = Optional.ofNullable(memory.get(sum)).orElse(new Integer[2]);
            if (memList[0] != null && memList[1] != null) {
                continue;
            }
            if (memList[0] == null) {
                memList[0] = n;
            } else {
                memList[1] = n;
            }
            memory.put(sum, memList);
        }
        AtomicInteger maxSum = new AtomicInteger();
        var resultProcess = memory.values().stream().filter(v -> !(v[0] == null) && !(v[1] == null)).toList();
        if (resultProcess.isEmpty()) {
            return -1;
        }
        resultProcess.forEach( (v) -> maxSum.set(Math.max(maxSum.get(), v[0] + v[1])));
        System.out.println(resultProcess);
        return maxSum.get();

    }

    private int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static void reverse(int[] a)
    {
        // length of an array
        int n = a.length;

        // swap the first half with the second half
        for (int i = 0; i < n / 2; i++) {

            // Store the first half elements temporarily
            int t = a[i];

            // Assign the first half
            // to the last half
            a[i] = a[n - i - 1];

            // Assign the last half
            // to the first half
            a[n - i - 1] = t;
        }
    }

    public static void main(String[] args) {
        LC2342MaxDigitSum solution = new LC2342MaxDigitSum();
        System.out.println(solution.maximumSum(new int[]{229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401})); // Output: 27
    }
}
