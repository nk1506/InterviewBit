package com.naveen.interviewBit.tree;

import java.util.List;

public class SortedToBST {
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        return sortedArrayToBSTUtil(a,0,a.size()-1);

    }

    public TreeNode sortedArrayToBSTUtil(List<Integer> a, int i, int j) {
        if (i>j) return null;
        int m = i+(j-i)/2;
        TreeNode treeNode = new TreeNode(a.get(m));
        treeNode.left = sortedArrayToBSTUtil(a,i,m-1);
        treeNode.right = sortedArrayToBSTUtil(a,m+1,j);
        return treeNode;
    }
}
