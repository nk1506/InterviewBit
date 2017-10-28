package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LongestSubSeq {

    private int[] lis;
    private int[] dis;
    public int longestSubSeq(int arr[]) {
        int l = getLIS(arr,arr.length);
        int d = getDIS(arr,arr.length);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            res = Math.max(res,lis[i]+dis[i]-1);
        }

        return res;

    }
    private int getLIS(int[] arr, int n) {
        lis = new int[n];
        Arrays.fill(lis,1);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                if (arr[i] > arr[j])
                    lis[i] = Math.max(lis[i],lis[j]+1);
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            max = Math.max(max,lis[i]);
        }
        return max;
    }

    private int getDIS(int[] arr, int n) {
        dis = new int[n];
        Arrays.fill(dis,1);
        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-1; j >i ; j--) {
                if (arr[i] > arr[j])
                    dis[i] = Math.max(dis[i],dis[j]+1);
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            max = Math.max(max,dis[i]);
        }
        return max;
    }
}
