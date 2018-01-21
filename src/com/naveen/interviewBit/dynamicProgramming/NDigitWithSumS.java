package com.naveen.interviewBit.dynamicProgramming;

import java.util.Arrays;

/**
 Find out the number of N digit numbers, whose digits on being added equals to a given number S. Note that a valid number starts from digits 1-9 except the number 0 itself. i.e. leading zeroes are not allowed.

 Since the answer can be large, output answer modulo 1000000007
 */

public class NDigitWithSumS {
    private int dp[][];
    private int k =0;
    public int solve(int A, int B) {
        if (A<=0) return 0;
        if (A==1 && B>9) return 0;
        if (A==1 && B<=9) return 1;
        dp = new int[A+1][B+1];
        for(int j = 1; j <= Math.min(B,9); j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <=A ; i++) {
            for (int j = 1; j <=B ; j++) {
                for (int l = 0; l <=Math.min(j,9) ; l++) {
                    dp[i][j] += dp[i-1][j-l];
                    dp[i][j] = dp[i][j]%1000000007;
                }
            }
        }
        k = dp[A][B];
        return k;
    }

    private int rec(int A, int B) {
        if (A <= 0 || B < 0) return 0;
        if (A==1 && B<=9) return 1;
        if (dp[A][B] != -1) return dp[A][B];
        int c =0;
        for (int i = 1; i <=A ; i++) {
            for (int j = 1; j <10 ; j++) {
                c+=rec(A-i,B-j);
            }
        }

        dp[A][B] =c;
        return dp[A][B];
    }
}
