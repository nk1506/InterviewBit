package com.naveen.interviewBit.dynamicProgramming;

import java.util.Arrays;

/**
 *

 A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26

 Given an encoded message containing digits, determine the total number of ways to decode it.

 Example :

 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.

 */

public class WaysToDecode {
    private String A;
    private int[] dp;
    public int numDecodings(String A) {
        this.A = A;

        int n = A.length();
        dp = new int[n];

        Arrays.fill(dp, -1);
        return recur(n-1);
    }

    private int recur(int id) {
        if (id<0) return 1;

        if (dp[id] != -1) return dp[id];
        int ways = 0;

        if (A.charAt(id) > '0') ways = recur(id-1);

        if (isValid(id)) {
            ways+=recur(id-2);
        }

        return dp[id] = ways;
    }

    private boolean isValid(int i) {
        if (i<=0) return false;
        if ((A.charAt(i-1) == '1' || A.charAt(i-1) == '2' && A.charAt(i) < '7')) return true;

        return false;

    }
}
