package com.naveen.interviewBit.sorting;

public class MergeSort {
    public void mergeSort(int[] ints) {
        mergeSortUtil(ints, 0, ints.length-1);
    }

    private void mergeSortUtil(int[] ints, int st, int en) {
        if (st >= en) return;
        int mid = (en+st)/2;

        mergeSortUtil(ints, st, mid);
        mergeSortUtil(ints, mid+1, en);
        merge(ints,st,mid,en);
        return;
    }

    private void merge(int[] ints, int st, int mid, int en) {

        int n1 = mid-st+1;
        int n2 = en-mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i <n1 ; i++) {
            l[i] = ints[st+i];
        }

        for (int i = 0; i <n2 ; i++) {
            r[i] = ints[mid+1+i];
        }

        int i=0,j=0,k=st;

        while (i<n1 && j< n2) {
            if (l[i] <= r[j]) {
                ints[k++] = l[i++];
            } else {
                ints[k++] = r[j++];
            }
        }

        while (i<n1) {
            ints[k++] =l[i++];
        }

        while (j<n2) {
            ints[k++] = r[j++];
        }

    }
}
