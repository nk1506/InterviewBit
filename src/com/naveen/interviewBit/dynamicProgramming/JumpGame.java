package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;

/**
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return 1 ( true ).

 A = [3,2,1,0,4], return 0 ( false ).


 */

public class JumpGame {
    public int canJump(ArrayList<Integer> A) {
        int N = A.size();
        if (A == null || N == 0 || N == 1) return 1;
        if (A.get(0) == 0) return 0;

        int count =A.get(0);
        int max = 0;

        for (int i = 1; i <N-1 ; i++) {
            max--;
            count--;
            max = Math.max(max,A.get(i));
            if (max <=0) return 0;
            if (count == 0) {
                count = max;
            }
        }
        return 1;

    }
}
