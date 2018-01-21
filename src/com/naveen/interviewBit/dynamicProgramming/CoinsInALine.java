package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

/**
 There are N coins (Assume N is even) in a line. Two players take turns to take a coin from one of the ends of the line until there are no more coins left. The player with the larger amount of money wins. Assume that you go first.

 Write a program which computes the maximum amount of money you can win.
 */

public class CoinsInALine {
    private long[][] dp;
    private int[][][] dp2;
    private ArrayList<Integer> a;
    public int maxcoin(ArrayList<Integer> A) {
        int N = A.size();
        dp = new long[N][N];
        this.a= A;
        for (int i = 0; i <N ; i++) {
            Arrays.fill(dp[i],-1);
        }
        dp2 = new int[2][N][N];
        for (int i = 0; i <N ; i++) {
            dp2[0][i][i] = a.get(i);
        }

        for (int len = 1; len <=N ; len++) {
            for (int i = 0; i <N-len ; i++) {
                int j = i+len;
                int l = a.get(i)+dp2[1][i+1][j];
                int r = a.get(j) + dp2[1][i][j-1];

                if (l>r) {
                    dp2[0][i][j] = l;
                    dp2[1][i][j] = dp2[0][i+1][j];
                } else {
                    dp2[0][i][j] = r;
                    dp2[1][i][j] = dp2[0][i][j-1];
                }
            }
        }


        return dp2[0][0][N-1];
    }

    private int rec(int st,int en) {
        if (en<=st) return 0;
        if ((en-st) == 1) {
            dp[st][en]=Math.max(dp[st][en],Math.max(a.get(st),a.get(en)));
            return (int)dp[st][en];
        }
        if (dp[st][en] != -1) return (int)dp[st][en];
        long sSum;
        long eSum;
        if (a.get(st+1) > a.get(en))
            sSum = a.get(st)+rec(st+2,en);
        else
            sSum = a.get(st)+rec(st+1,en-1);
        if (a.get(st) > a.get(en-1))
            eSum = a.get(en) + rec(st+1, en-1);
        else
            eSum = a.get(en) + rec(st,en-2);
        //dp[st][en] = Math.max(dp[st][en],Math.max(a.get(st)+rec(st+1,en),a.get(en)+rec(st,en-1)));
        dp[st][en] = Math.max(dp[st][en], Math.max(sSum,eSum));
        return (int)dp[st][en];
    }
}
