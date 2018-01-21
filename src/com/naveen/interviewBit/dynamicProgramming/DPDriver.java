package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class DPDriver {
    public static void main(String[] args) {
        CoinsInALine kthManhattan = new CoinsInALine();
        ArrayList<Integer> row2 = new ArrayList<>(); //[ 46, 12, 42, 67 ]
        row2.add(46);
        row2.add(12);
        row2.add(42);
        row2.add(67);
        int x = kthManhattan.maxcoin(row2);
        System.out.println(x);
        return;
    }
}
