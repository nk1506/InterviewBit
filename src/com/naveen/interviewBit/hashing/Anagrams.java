package com.naveen.interviewBit.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        int id = 1;
        for (String string: a) {
            char[] chars= string.toCharArray();
            Arrays.sort(chars);
            string = Arrays.toString(chars);
            ArrayList<Integer> list = new ArrayList<>();
            if (hashMap.containsKey(string)) {
                list = hashMap.get(string);
                list.add(id);
                hashMap.put(string,list);
            } else {
                list.add(id);
                hashMap.put(string,list);
            }
            id++;
        }
        hashMap.forEach((s, arrayList) -> result.add(arrayList));
        return result;
    }
}
