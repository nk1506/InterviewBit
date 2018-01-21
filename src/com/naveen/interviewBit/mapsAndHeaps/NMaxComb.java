package com.naveen.interviewBit.mapsAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 Given two arrays A & B of size N each.
 Find the maximum n elements from the sum combinations (Ai + Bj) formed from elements in array A and B.

 For example if A = [1,2], B = [3,4], then possible pair sums can be 1+3 = 4 , 1+4=5 , 2+3=5 , 2+4=6
 and maximum 2 elements are 6, 5

 Example:

 N = 4
 a[]={1,4,2,3}
 b[]={2,5,1,6}
 */

public class NMaxComb {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> heap2 = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i <N ; i++) {
            heap1.add(A.get(i)+B.get(0));
            heap2.add(A.get(i)+B.get(0));
        }
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                heap1.add(A.get(i)+B.get(j));
                heap2.add(A.get(i)+B.get(j));
            }

        }
        for (int i = 0; i <N ; i++) {
            result.add(heap1.poll());
        }
        return result;
    }
}
