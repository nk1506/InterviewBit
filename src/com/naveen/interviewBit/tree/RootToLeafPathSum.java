package com.naveen.interviewBit.tree;

import java.util.ArrayList;

public class RootToLeafPathSum {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private int b;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        this.b = B;
        if (A== null) return result;
        pathSumValid(A,0,new ArrayList<>());
        return result;


    }

    private void pathSumValid(TreeNode a, int s, ArrayList<Integer> list) {
        if (a == null) return;
        if (a.left == null && a.right == null ) {
            if (((s+a.val) == b)) {
                list.add(a.val);
                result.add(list);
                list.remove(list.size()-1);
            }
            return;
        }
        list.add(a.val);
        s+=a.val;
        pathSumValid(a.left,s,list);
        pathSumValid(a.right,s,list);
        list.remove(list.size()-1);
    }
}
