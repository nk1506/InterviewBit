package com.naveen.interviewBit;

import com.naveen.interviewBit.tree.HotelReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class StringDriver {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        String string = new String("Naveen");
        string.replace('a','b');
        System.out.print(string);
        return;
    }

}
