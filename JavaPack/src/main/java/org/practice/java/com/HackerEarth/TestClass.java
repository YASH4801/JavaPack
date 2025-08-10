package org.practice.java.com.HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- != 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            String[] arr = br.readLine().split(" ");
            int[] inp = new int[arr.length];
            for (int i = 0; i < n; i++) {
                inp[i] = Integer.parseInt(arr[i]);
            }
            // Reading input from STDIN
        }
        System.out.println();    // Writing output to STDOUT
    }

    private int[] getResult(int[] input, int n, int x) {
        return new int[9];
    }
}
