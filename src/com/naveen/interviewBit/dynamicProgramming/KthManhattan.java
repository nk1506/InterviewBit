package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Given a matrix M of size nxm and an integer K, find the maximum element in the K manhattan distance neighbourhood for all elements in nxm matrix.
 In other words, for every element M[i][j] find the maximum element M[p][q] such that abs(i-p)+abs(j-q) <= K.

 Note: Expected time complexity is O(N*N*K)
 */

public class KthManhattan {
    private int dp[][][];
    private int r,c;
    public ArrayList<ArrayList<Integer>> solve(int A, ArrayList<ArrayList<Integer>> B) {
        if (A == 0) return B;
        if (B == null) return B;
        this.r = B.size();
        if (r == 0) return B;
        this.c = B.get(0).size();
        dp = new int[r][c][A+1];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                Arrays.fill(dp[i][j],-1);
            }
        }
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                rec(B,i,j,A);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i <r ; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <c ; j++) {
                row.add(dp[i][j][A]);
            }
            result.add(row);
        }
        return result;

    }

    private int rec(ArrayList<ArrayList<Integer>> lists, int i, int j, int k) {
        if (i<0 || j< 0) return Integer.MIN_VALUE;
        if (i>=r || j>= c) return Integer.MIN_VALUE;
        if (k==0) return  lists.get(i).get(j);
        if (dp[i][j][k] != -1) return dp[i][j][k];

        int l = rec(lists,i,j-1,k-1);
        int r = rec(lists,i,j+1,k-1);
        int u = rec(lists,i-1,j,k-1);
        int d = rec(lists,i+1,j,k-1);
        dp[i][j][k] = Math.max(lists.get(i).get(j),Math.max(Math.max(l,r),Math.max(u,d)));
        return dp[i][j][k];
    }
}
