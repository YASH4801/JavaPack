package org.practice.java.com.LeetCode.Solutions;

import java.util.Arrays;

public class LC407TapRW2 {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        int[][] prev = new int[m][n];
        for (int row = 0; row < m; row++) {
            prev[row] = Arrays.copyOf(heightMap[row], n);
        }
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int cvol = getVolume(heightMap[i][j], prev[i][j-1], prev[i][j+1], prev[i-1][j], prev[i+1][j]);
                prev[i][j] = cvol;
            }
        }
        return calculateTappedVolume(prev, m, n) - calculateTappedVolume(heightMap, m, n);
    }

    private int getVolume(int c, int a, int b, int k, int i) {
        int min = a;
        min = Math.min(min, b);
        min = Math.min(min, c);
        if (min <= c) {
            return 0;
        }
        return min - c;
    }

    private int calculateTappedVolume( int[][] arr, int m, int n) {
        int sum = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n -1; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
