package com.naveen.interviewBit.dynamicProgramming;

public class Stairs {
    public int climbStairs(int a) {
        int arr[] = new int[a+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <=a ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[a];
    }
}
