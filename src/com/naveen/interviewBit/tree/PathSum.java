package com.naveen.interviewBit.tree;

public class PathSum {
    public int hasPathSum(TreeNode a, int b) {
        boolean val = hasPathSumUtil(a,b,0);
        return val?1:0;
    }

    public boolean hasPathSumUtil(TreeNode a, int b, int curSum) {
        if (a==null) return b==0;
        if (b==0) return true;
        return a.val==b||hasPathSumUtil(a.left,b-a.val,curSum) || hasPathSumUtil(a.right,b-a.val,curSum);
    }
}
