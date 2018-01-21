package com.naveen.interviewBit.mapsAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MagicianAndChocklates {
    public int nchoc(int A, ArrayList<Integer> B) {
        long res = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i <B.size() ; i++) {
            priorityQueue.add(B.get(i));
        }
        for (int i = 1; i <=A ; i++) {
            int x = priorityQueue.poll();
            res+=x;
            res=res%1000000007;
            priorityQueue.add(x/2);
        }

        return (int)res%1000000007;
    }
}
