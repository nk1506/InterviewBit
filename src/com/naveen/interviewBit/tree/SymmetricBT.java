package com.naveen.interviewBit.tree;

import com.naveen.interviewBit.utils.TreeUtilities;

public class SymmetricBT {

    public int isSymmetric(TreeNode a) {
        if (a==null) return 1;
        return new TreeUtilities().isMirror(a.left,a.right)?1:0;
    }


}
