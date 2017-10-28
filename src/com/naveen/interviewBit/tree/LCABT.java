package com.naveen.interviewBit.tree;

public class LCABT {
    boolean v1,v2;
    public int lca(TreeNode a, int val1, int val2) {
        v1 = isNode(a,val1);v2 = isNode(a,val2);
        TreeNode r = lcaUtil(a,val1,val2);
        if (r == null) return -1;
        return v1&&v2?r.val:-1;
    }

    private TreeNode lcaUtil(TreeNode a, int b, int c) {
        if (a==null) return null;
        if (a.val == b || a.val == c) {
            return a;
        }
        TreeNode l = lcaUtil(a.left,b,c);
        TreeNode r = lcaUtil(a.right,b,c);
        if (l!= null && r!= null) return a;
        return l==null?r:l;
    }

    private boolean isNode(TreeNode a, int val) {
        if (a== null) return false;
        if (a.val == val) return true;
        return isNode(a.left, val) || isNode(a.right, val);
    }
}
