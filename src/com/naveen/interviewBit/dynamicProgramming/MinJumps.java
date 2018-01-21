package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

/**


 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 Example :
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

 If it is not possible to reach the end index, return -1.

 */

public class MinJumps {
    public int jump(ArrayList<Integer> A) {
        if (A == null || A.size() == 0 || A.size() == 1)  return 0;
        if (A.get(0) == 0)  return -1;
        int size = A.size();
        int count = A.get(0);
        int max =0;
        int steps = 0;

        for (int i = 1; i <size ; i++) {
            count--;
            max--;
            max = Math.max(max,A.get(i));

            if (i == (size-1)) return steps+1;

            if (count == 0) {
                if (max<0) return -1;
                count = max;
                max = 0;
                steps++;
            }
        }

        return -1;
    }
}
