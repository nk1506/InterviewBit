package com.naveen.interviewBit.sorting;


import java.util.ArrayList;
import java.util.List;

//arr[] = {10, 80, 30, 90, 40, 50, 70}
public class QuickSort {
    public void quickSort(int[] ints) {

        quickSortUtil(ints,0,ints.length-1);

    }

    private void quickSortUtil(int[] arr, int st, int en) {
        if (st >= en) return;

        int p = partition(arr, st, en);

        quickSortUtil(arr,st, p-1);
        quickSortUtil(arr, p+1,en);
    }

    private int partition(int[] arr, int st, int en) {
        int p = arr[en];
        int j = st-1;
        for (int i = st; i <en ; i++) {
            if (arr[i] <= p) {
                j++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }

        j++;

        int t = arr[j];
        arr[j] = p;
        arr[en] = t;

        return j;
    }
}
