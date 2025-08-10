package org.practice.java.com.LeetCode.Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LC3160FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> cb = new HashMap<>();
        HashMap<Integer, Integer> bf = new HashMap<>();
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int b = queries[i][0];
            int c = queries[i][1];
            if (cb.containsKey(b)) {
                int v = bf.get(cb.get(b));
                bf.put(cb.get(b), --v);
                v = bf.getOrDefault(c, 0);
                bf.put(c, ++v);
            }
            cb.put(b, c);
            int v = bf.getOrDefault(c, 0);
            bf.put(c, ++v);
        }
        return res;
    }
}