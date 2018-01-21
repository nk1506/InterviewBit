package com.naveen.interviewBit.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> a) {
        String res;
        int minL = Integer.MAX_VALUE;
        for (String anA : a) {
            minL = Math.min(minL, anA.length());
        }
        int count = 0;
        int k = 0;
        for (int i=0;i<minL;i++) {
            count=0;
            for (int j=1;j<a.size();j++) {
                if (a.get(j).charAt(i) == a.get(j-1).charAt(i)) {
                    count++;
                } else break;
            }
            if (count == a.size()-1) k++;
            else break;
        }
        res = k != 0? a.get(0).substring(0,k):"";
        return res;
    }
}
