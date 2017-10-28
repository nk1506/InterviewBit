package com.naveen.interviewBit.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new TrieNode(c);
                children.put(c,t);
            }
            children = t.children;
            if (i == word.length()-1)
                t.isLeaf = true;
        }
    }

    public boolean search(String word) {
        //1st Solution
       /* TrieNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            Set<Character> trieNodeList = temp.children.keySet();
            char c = word.charAt(i);
            if(trieNodeList.contains(c)) {
                temp = temp.children.get(c);
            }
        }

        if (temp.isLeaf) result = true;*/

        HashMap<Character, TrieNode> children = root.children;
        TrieNode t = null;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else return false;
        }
        return t!=null && t.isLeaf;
    }
}
