package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HotelReviews {
    private Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        ArrayList<Integer> result = new ArrayList<>();

        HashSet<String> goodwords = new HashSet<String>();
        String[] words = A.split("_");
        for(String word: words){goodwords.add(word);}

        int k = 0;
        for (int i = 0;i<B.size(); i++) {
            List<String> tempWords = Arrays.asList(B.get(i).split("_"));
            int max =0;
            for (String word: tempWords) {
                if (goodwords.contains(word)) {
                    max++;
                }
            }
            ArrayList<Integer> values = new ArrayList<>();
            if (map.containsKey(max)) {
                values = map.get(max);
            }
            values.add(i);
            map.put(max,values);
            k = Math.max(k,max);
        }

        for (int i = k; i >=0 ; i--) {
            if (map.containsKey(i))
                result.addAll(map.get(i));
        }

        return result;
    }

}
