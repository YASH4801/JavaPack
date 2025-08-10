package org.practice.java.com.LeetCode.Solutions;

import java.util.Arrays;

public class LC1368MinCostToGetValidPath {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] minChanges = new int[m][n];

        for (int[] row : grid) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        minChanges[0][0] = 0;
        while (true) {
            int[][] prev = new int[m][n];
            for (int row = 0; row < m; row++) {
                prev[row] = Arrays.copyOf(minChanges[row], n);
            }
            
        }
    }
}
