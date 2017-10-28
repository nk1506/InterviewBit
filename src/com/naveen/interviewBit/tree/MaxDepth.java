package com.naveen.interviewBit.tree;

import com.naveen.interviewBit.utils.TreeUtilities;

public class MaxDepth {
    public int maxDepth(TreeNode a) {
        return new TreeUtilities().height(a);
    }
}
