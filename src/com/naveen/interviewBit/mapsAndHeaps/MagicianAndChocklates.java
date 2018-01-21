package com.naveen.interviewBit.mapsAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ADOBE CONFIDENTIAL ___________________
 * <p>
 * Copyright 2011 Adobe Systems Incorporated All Rights Reserved.
 * <p>
 * NOTICE: All information contained herein is, and remains the property of
 * Adobe Systems Incorporated and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Adobe Systems
 * Incorporated and its suppliers and may be covered by U.S. and Foreign
 * Patents, patents in process, and are protected by trade secret or copyright
 * law. Dissemination of this information or reproduction of this material is
 * strictly forbidden unless prior written permission is obtained from Adobe
 * Systems Incorporated.
 *
 * @author navkumar@adobe.com
 * @file ${FILE_NAME}
 * @since 01/01/18
 */

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
