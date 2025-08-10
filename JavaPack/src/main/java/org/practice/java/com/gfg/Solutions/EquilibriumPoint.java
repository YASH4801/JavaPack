package org.practice.java.com.gfg.Solutions;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            leftSum += arr[i];

            if (leftSum == sum - leftSum) {
                return i;
            }
        }
        return -1;
    }


}
