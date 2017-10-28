package com.naveen.interviewBit.maths;

import java.util.List;

public class FindDuplicate {
    public int repeatedNumber(final List<Integer> a) {
        int arr[] = new int[a.size()+2];
        for (Integer integer: a) {
            if (arr[integer] == 1) return integer;
            arr[integer] = 1;
        }
        return -1;
    }
}
