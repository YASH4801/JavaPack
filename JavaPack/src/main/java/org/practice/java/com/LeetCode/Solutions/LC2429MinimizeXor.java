package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class LC2429MinimizeXor {

    public static void main(String[] args) {
        LC2429MinimizeXor minimizeXor = new LC2429MinimizeXor();
        System.out.println(minimizeXor.minimizeXor(91, 18)); // Output: 3
    }
    public int minimizeXor(int num1, int num2) {
        int i = 1;
        while (i < Integer.MAX_VALUE) {
            if (Integer.bitCount(num1) == Integer.bitCount(num2)) {

            }
        }
        return 0;
    }


//    {
//        List<Integer> result = generateIntegersWithSameNumberOfOnes(num2);
//        if (result.contains(num1)) return num1;
//        Pair minXor = new Pair();
//        minXor.minValue = Integer.MAX_VALUE;
//        minXor.xorValue = -1;
//        result.forEach(integer -> {
//            int min = Math.min(minXor.minValue, Math.abs(num1 ^ integer));
//            if (!(minXor.minValue == min)) {
//                minXor.minValue = min;
//                minXor.xorValue = integer;
//            }
//        });
//        return minXor.xorValue;
//    }

    public static List<Integer> generateIntegersWithSameNumberOfOnes(int number) {
        int countOfOnes = Integer.bitCount(number);
        List<Integer> result = new ArrayList<>();
        int maxNumber = Integer.MAX_VALUE - 1;
        for (int i = 0; i <= maxNumber; i++) {
            if (Integer.bitCount(i) == countOfOnes) {
                result.add(i);
            }
        }
        return result;
    }
}


