package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**


 Find longest Arithmetic Progression in an integer array and return its length. More formally, find longest sequence of indeces, 0 < i1 < i2 < … < ik < ArraySize(0-indexed) such that sequence A[i1], A[i2], …, A[ik] is an Arithmetic Progression. Arithmetic Progression is a sequence in which all the differences between consecutive pairs are the same, i.e sequence B[0], B[1], B[2], …, B[m - 1] of length m is an Arithmetic Progression if and only if B[1] - B[0] == B[2] - B[1] == B[3] - B[2] == … == B[m - 1] - B[m - 2].
 Examples
 1) 1, 2, 3(All differences are equal to 1)
 2) 7, 7, 7(All differences are equal to 0)
 3) 8, 5, 2(Yes, difference can be negative too)

 Samples
 1) Input: 3, 6, 9, 12
 Output: 4

 2) Input: 9, 4, 7, 2, 10
 Output: 3(If we choose elements in positions 1, 2 and 4(0-indexed))

 */

public class LongestAP {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        if (A == null) return 0;
        if (A.size() <=2) return A.size();
        int res= 1;
        int N = A.size();
        List<Map<Integer,Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <N ; i++) {
            list.add(new HashMap<>());
            map = list.get(i);
            for (int j = 0; j < i; j++) {
                int diff = A.get(j)-A.get(i);
                int d = 2;
                if (list.get(j).get(diff) == null) {
                    map.put(diff,d);
                } else {
                    Map<Integer,Integer> temp = list.get(j);
                    d = temp.get(diff)+1;
                    map.put(diff,d);
                }
                res = Math.max(res,d);
            }
        }
        return res;
    }
}
