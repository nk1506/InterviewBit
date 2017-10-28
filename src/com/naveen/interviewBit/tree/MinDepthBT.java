package com.naveen.interviewBit.tree;

import com.naveen.interviewBit.utils.TreeUtilities;

public class MinDepthBT {
    int res = Integer.MAX_VALUE;
    public int minDepth(TreeNode a) {
        return res;
    }
    private void minDepthUtil(TreeNode a, int lht, int rht) {
        if (a == null) return ;
        minDepthUtil(a.left, lht+1, rht);
        minDepthUtil(a.right, lht,rht+1);
        res = Math.min(res,Math.min(lht,rht));

    }
}
