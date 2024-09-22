package org.practice.java.com.LeetCode.Solutions.InterviewSeries.Arrays;

public class MirrorArray {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n - 1; i++) {
            transpose(matrix, i);
        }
        printArray(matrix);
        for (int i = 0; i < n; i++) {
            reverseRow(matrix, i);
        }
    }

    private void reverseRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length / 2; j++) {
            swap(matrix, i, j, i, (matrix.length - 1) - j);
        }
    }

    private void transpose(int[][] matrix, int i) {
        for(int j = i; j < matrix.length; j++) {
            if(i == j) continue;
            swap(matrix, i, j, j, i);
        }
    }

    private void swap(int[][] matrix, int i, int j, int a, int b) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[a][b];
        matrix[a][b] = temp;
    }

    private void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++ ){
                System.out.print("| " + matrix[i][j] + " |");
            }
            System.out.println();
        }

    }
}
