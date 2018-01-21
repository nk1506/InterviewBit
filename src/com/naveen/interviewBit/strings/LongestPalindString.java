package com.naveen.interviewBit.strings;

/*
*

Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"

* */
public class LongestPalindString {
    public String longestPalindrome(String a) {
        if (a == null || a.length() == 1) return a;
        int l = a.length();
        
        int maxL = 0;
        int st=0,en=0;
        for (int i = 1; i < l/2; i++) {
            for (int j = 1; j <l-i ; j++) {

            }
            
        }
        return a.substring(st,en+1);

    }
}
