package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<>();
        nonRecursiveTraverse(a, result);
        return result;
    }

    private void recursiveTraverse(TreeNode a, ArrayList<Integer> result ) {
        if (a == null) return ;
        recursiveTraverse(a.left, result);
        result.add(a.val);
        recursiveTraverse(a.right, result);
        return;
    }

    private void nonRecursiveTraverse(TreeNode a, ArrayList<Integer> arrayList) {
        if (a == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(a);
        TreeNode temp = stack.peek();
        while (!stack.empty()) {
            while (temp.left != null) {
                stack.add(temp.left);
                temp = temp.left;
            }
            TreeNode lastNode = stack.pop();
            arrayList.add(lastNode.val);
            if (lastNode.right != null) {
                stack.add(lastNode.right);
                //replace temp with peek element.
                temp = lastNode.right;
            }
        }
    }

}
