package com.naveen.interviewBit.tree;

public class IdenticalBT {
    public int isSameTree(TreeNode a, TreeNode b) {
        return isSameTreeUtil(a,b)? 1: 0;
    }

    private boolean isSameTreeUtil(TreeNode a, TreeNode b) {
        return (a.left.val == a.right.val) && isSameTreeUtil(a.left, b.left) && isSameTreeUtil(a.right,b.right);
    }
}
