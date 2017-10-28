package com.naveen.interviewBit.maths;

public class GCD {
    public int gcd(int a, int b) {
        if (a%b == 0) return b;
        return gcd(b%a, b);
    }
}
