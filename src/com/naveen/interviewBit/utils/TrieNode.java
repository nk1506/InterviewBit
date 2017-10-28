package com.naveen.interviewBit.utils;

import java.util.HashMap;

public class TrieNode {
    char ch;
    boolean isLeaf;
    HashMap<Character, TrieNode> children = new HashMap<>();

    public TrieNode() {

    }

    public TrieNode(char c) {
        this.ch = c;
    }
}
