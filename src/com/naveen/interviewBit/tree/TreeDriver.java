package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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
 * @since 07/01/18
 */

public class TreeDriver {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        priorityQueue.add(1);
        priorityQueue.add(11);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(2);
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Iterator<Integer> iterator1 = queue.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        Stack<Integer> stack = new Stack<>();
        Iterator<Integer> iterator2 = stack.iterator();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (iterator2.hasNext()) {
            System.out.println(stack.pop());
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);

        map.forEach((integer, integer2) -> System.out.println(integer+integer2));
        map.entrySet().forEach(integerIntegerEntry -> System.out.println(integerIntegerEntry.getKey() + integerIntegerEntry.getValue()));

        return;
    }
}
