package com.naveen.interviewBit.strings;

public class PalindromeString {
    public int isPalindrome(String a) {
        a = a.toLowerCase();
        int l = a.length();
        int i = 0,j=l-1;
        while (i<l && j>0) {
            char aChar = a.charAt(i);
            char bChar = a.charAt(j);
            if (!Character.isLetterOrDigit(aChar)) {
                i++; continue;
            }
            if (!Character.isLetterOrDigit(bChar)) {
                j--; continue;
            }
            if (aChar != bChar) return 0;
            i++;j--;
        }
        return 1;
    }
}
