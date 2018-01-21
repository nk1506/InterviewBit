package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;


public class VerticalTraversal {
    Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        queue.add(null);
        while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                if (temp == null) {
                    if (!queue.isEmpty()) {
                        queue.add(null);
                    }
                    continue;
                }
                recursive(A,temp,0);
                if (temp.left!=null)queue.add(temp.left);
                if (temp.right!=null)queue.add(temp.right);
        }
        map.forEach((integer, integers) -> result.add(integers));
        return result;
    }
    public ArrayList<ArrayList<Integer>> QueueVerticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Map<TreeNode, Integer> info = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        info.put(A,0);


        while(!q.isEmpty()) {
            TreeNode t = q.poll();
            int x = info.get(t);
            if(t.left != null) {
                info.put(t.left,x-1);
                q.add(t.left);
            }
            if(t.right != null) {
                info.put(t.right,x+1);
                q.add(t.right);
            }

            ArrayList<Integer> d = map.get(x);
            if ( d == null) {
                d = new ArrayList<Integer>();
            }
            d.add(t.val);
            map.put(x,d);
        }

        Set<Integer> set = map.keySet();
        for (Integer i: set) {

        }

        return res;

    }
    private void recursive(TreeNode a, TreeNode b, int hd) {
        if (a == null) return;
        if (a == b) {
            if (map.containsKey(hd)) {
                ArrayList<Integer> list = map.get(hd);
                list.add(a.val);
                map.put(hd,list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a.val);
                map.put(hd,list);
            }
        }
        recursive(a.left,b,hd-1);
        recursive(a.right,b,hd+1);
    }
    private int minHt(TreeNode a, int ht) {
        if (a == null) return ht;
        int l = minHt(a.left, ht-1);
        int r = minHt(a.right, ht+1);
        return Math.min(l,r);
    }

    private int maxHt(TreeNode a, int ht) {
        if (a == null) return ht;
        int l = maxHt(a.left, ht-1);
        int r = maxHt(a.right, ht+1);
        return Math.max(l,r);
    }
}
