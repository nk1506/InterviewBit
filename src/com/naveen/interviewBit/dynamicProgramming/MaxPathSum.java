package com.naveen.interviewBit.dynamicProgramming;

import com.naveen.interviewBit.tree.TreeNode;

/**


 Given a binary tree, find the maximum path sum.

 The path may start and end at any node in the tree.

 Example :

 Given the below binary tree,

 1
 / \
 2   3

 Return 6.

 */

public class MaxPathSum {
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
        maxPathSumUtil(A);
        return maxSum;
    }
    public int maxPathSumUtil(TreeNode A) {
        if (A == null) return 0;
        int l = maxPathSumUtil(A.left);
        int r = maxPathSumUtil(A.right);

        int withRootSum = Math.max(A.val,Math.max(l,r)+A.val);
        int uptoMaxSum = Math.max(withRootSum,A.val+l+r);
        maxSum = Math.max(maxSum,uptoMaxSum);
        return withRootSum;
    }
}
