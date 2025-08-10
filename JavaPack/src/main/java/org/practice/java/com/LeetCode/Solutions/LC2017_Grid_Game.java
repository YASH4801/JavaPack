package org.practice.java.com.LeetCode.Solutions;

public class LC2017_Grid_Game {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long fs = getSum(grid[0]);
        long ss = 0;
        long minSum = Long.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            fs -= grid[0][i];
            minSum = Math.min(minSum, Math.max(fs, ss));
            ss += grid[1][i];
        }
        return minSum;
    }

    private long getSum(int[] ints) {
        int sum = 0;
        for (int i: ints) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LC2017_Grid_Game gridGame = new LC2017_Grid_Game();
        int[][] grid = {{2,5,4},{1,5,1}};
        System.out.println(gridGame.gridGame(grid)); // Output: 18
    }
}
