package com.naveen.interviewBit.dynamicProgramming;

public class N3Board {
    public int solve(int A) {
        long t = 24;
        long d = 12;


        for (int i = 2; i <=A ; i++) {
            long tempT  = (t*11)%1000000007 + (d*10)%1000000007;
            long tempD = (t*5)%1000000007 + (d*7)%1000000007;
            t = tempT%1000000007;
            d = tempD%1000000007;
        }

        return (int)(t+d)%1000000007;
    }
}
