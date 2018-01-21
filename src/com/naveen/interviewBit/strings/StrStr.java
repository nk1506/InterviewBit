package com.naveen.interviewBit.strings;

public class StrStr {
    public int strStr(final String A, final String B) {
        if (A == null || A.length() ==0) return -1;
        if (B == null || B.length() == 0) return -1;
        int lA = A.length();
        int lB = B.length();
        if (lA < lB) return -1;
        int j;
        for (int i = 0; i <=lA-lB ; i++) {
            int k =i;
            for (j = 0; j <lB ;j++) {
                if (A.charAt(k++) != B.charAt(j)) break;
            }

            if (j==lB) {
                return i;
            }
        }
        return -1;

    }
}
