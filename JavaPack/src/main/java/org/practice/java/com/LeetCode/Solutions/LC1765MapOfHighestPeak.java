package org.practice.java.com.LeetCode.Solutions;

public class LC1765MapOfHighestPeak {
    public int[][] highestPeak(int[][] isWater) {
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                if (isWater[i][j]  == 1){
                    isWater[i][j] = 0;
                } else {
                    isWater[i][j] = 1;
                }
            }
        }
        return isWater;
    }

    private void bfs(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                updateNaighboirs(isWater, i, j, m, n);
            }
        }

    }

    private void updateNaighboirs(int[][] isWater, int i, int j, int m, int n) {
        if(i == 0 && j == 0) {
            updateWater(isWater, i, j+1, i, j);
            updateWater(isWater, i+1, j, i, j);
        } else if (i == m - 1 && j == 0) {
            updateWater(isWater, i-1, j, i, j);
            updateWater(isWater, i, j+1, i, j);
        } else if (i == 0 && j == n - 1) {
            updateWater(isWater, i, j-1, i, j);
            updateWater(isWater, i+1, j, i, j);
        } else if (i == m - 1 && j == n - 1) {
            updateWater(isWater, i-1, j, i, j);
            updateWater(isWater, i, j-1, i, j);
        } else if (i == 0) {
            updateWater(isWater, i , j-1, i, j);
            updateWater(isWater, i , j+1, i, j);
            updateWater(isWater, i+1 , j, i, j);
        } else if( j == 0) {
            updateWater(isWater, i - 1, j, i, j);
            updateWater(isWater, i + 1, j, i, j);
            updateWater(isWater, i+1, j+1, i, j);
        } else if (j == n-1) {
            updateWater(isWater, i-1, j, i, j);
            updateWater(isWater, i+1, j, i, j);
            updateWater(isWater, i, j-1, i, j);
        } else if (i == m-1) {
            updateWater(isWater, i-1, j, i, j);
        }
    }

    private void updateWater(int[][] isWater, int i, int j, int oldI, int oldJ) {
        if (Math.abs(isWater[oldI][oldJ] - isWater[i][j] ) > 1) {
            if (isWater[oldI][oldJ]  > isWater[i][j]) {
                isWater[oldI][oldJ]  = isWater[i][j]++;
            } else {
                isWater[i][j]  = isWater[oldI][oldJ]++;
            }
        }
    }
}
