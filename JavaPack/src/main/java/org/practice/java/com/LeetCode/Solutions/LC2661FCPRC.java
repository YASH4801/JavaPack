package org.practice.java.com.LeetCode.Solutions;

import java.util.HashMap;
import java.util.Map;

public class LC2661FCPRC {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(mat[i][j], new int[]{i, j});
            }
        }

        for (int i = 0; i < m * n; i++) {
            int[] cood = searchElement(map, arr[i]);
            row[cood[0]]++;
            col[cood[1]]++;
            if (checkReached(row, m) || checkReached(col, n)) {
                return i;
            }
        }
        return -1;
    }

    private int[] searchElement(Map<Integer, int[]> map, int k) {
        return map.get(k);
    }

    private boolean checkReached(int[] arr, int l) {
        for (int i: arr) {
            if (i == l) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LC2661FCPRC solution = new LC2661FCPRC();
        int[] arr = {1,3,4,2};
        int[][] mat = {{1,4},{2,3}};
        System.out.println(solution.firstCompleteIndex(arr, mat)); // Output: 3
    }
}
