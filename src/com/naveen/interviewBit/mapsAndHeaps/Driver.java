package com.naveen.interviewBit.mapsAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2147483647);
        list.add(2000000014);
        list.add(2147483647);
        MagicianAndChocklates magicianAndChocklates = new MagicianAndChocklates();
        int x = magicianAndChocklates.nchoc(10,list);
        return;
    }
}
