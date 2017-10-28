package com.naveen.interviewBit.utils;

import com.naveen.interviewBit.tree.TreeNode;

public class TreeUtilities {

    public int height(TreeNode a) {
        if (a == null) return 0;
        return Math.max(height(a.left),height(a.right))+1;
    }

    public boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null) return b==null;
        if (b == null) return false;
        return (a.val == b.val) && isMirror(a.left,b.right) && isMirror(a.right,b.left);

    }
}
