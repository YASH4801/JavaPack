package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.List;

public class LC1980FUBS {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<String> data = new ArrayList<>();
        generate(data, n, new StringBuilder());
        data.removeAll(List.of(nums));
        return data.get(0);
    }

    private void generate(List<String> data, int n, StringBuilder sb) {
        if (n == 0) {
            data.add(sb.toString());
            return;
        }
        sb.append(0);
        generate(data, n-1, sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(1);
        generate(data, n-1, sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
