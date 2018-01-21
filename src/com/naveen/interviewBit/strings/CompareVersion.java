package com.naveen.interviewBit.strings;

public class CompareVersion {
    public int compareVersion(String A, String B) {
        int lA = A.length();
        int lB = B.length();
        int Ai=0,Bi=0;
        int i=0,j=0,k=0,l=0;
        while (true) {
            if (A.charAt(i) == '.') {
                Ai = getFirstNonZeroChar(A.substring(i+1,lA));
            }

            if (B.charAt(i) == '.') {
                Bi = getFirstNonZeroChar(B.substring(j+1,lB));
            }

            for (k = Ai; k <lA ; k++) {
                for (l = Bi; l <lB ; l++) {
                    if (A.charAt(k) == '.' && B.charAt(l) == '.') break;
                    if (A.charAt(k) == '.') return -1;
                    if (B.charAt(l) == '.') return 1;
                    if (A.charAt(k) > B.charAt(l)) return 1;
                    if (A.charAt(k) < B.charAt(l)) return -1;
                }
            }
            i=k;
            j=l;
            if (i==lA);
        }
    }

    private int getFirstNonZeroChar(String string) {
        if (string == null) return 0;
        int i=0;
        while (i<string.length()) {
            if (string.charAt(i) != '0') break;
            i++;
        }
        return i;
    }
}
