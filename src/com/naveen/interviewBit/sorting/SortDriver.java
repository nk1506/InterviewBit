package com.naveen.interviewBit.sorting;

public class SortDriver {

    public static void main(String[] args) {
       MergeSort mergeSort = new MergeSort();
       int[] arr = {9,5,4,1};

       mergeSort.mergeSort(arr);

       QuickSort quickSort = new QuickSort();
       //quickSort.quickSort(arr);
       return;
    }
}
