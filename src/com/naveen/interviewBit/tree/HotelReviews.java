package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HotelReviews {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        List<String> goodWords = Arrays.asList(A.split("_"));
        B.forEach(s -> {
            int count = 0;
            //map.put(s.)
            List<String> words = Arrays.asList(s.split("_"));
            words.forEach((s1) -> {
                if (goodWords.contains(s1));

            });
        });

        return result;
    }
}
