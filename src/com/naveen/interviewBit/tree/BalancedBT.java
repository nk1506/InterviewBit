package com.naveen.interviewBit.tree;


import com.naveen.interviewBit.utils.TreeUtilities;

public class BalancedBT {
    private TreeUtilities utilities = new TreeUtilities();
    public int isBalanced(TreeNode a) {
        return isBalancedUtil(a)?1:0;
    }

    private boolean isBalancedUtil(TreeNode a) {
        return a== null || ((Math.abs(utilities.height(a.left)-utilities.height(a.right))<=1)&& isBalancedUtil(a.left) && isBalancedUtil(a.right));
    }
}
