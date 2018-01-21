package com.naveen.interviewBit.strings;


public class MinmCharToPalind {
    public int solve(String A) {
        int l = A.length();
        int j =l;
        while (j>1) {
            if (isPalindrome(A.substring(0,j))) {
                return l-j;
            } else {
                j--;
            }
        }
        return l-j;
    }

    private boolean isPalindrome(String a) {
        int i = 0, j = a.length()-1;
        while (i<a.length() && j>0) {
            if (a.charAt(i++) != a.charAt(j--)) return false;
        }
        return true;
    }
}
