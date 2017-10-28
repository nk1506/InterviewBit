package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {

    public ArrayList<Integer> solution(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(a);
        while (!stack1.empty()) {
            TreeNode treeNode = stack1.pop();
            stack2.push(treeNode);
            if (treeNode.right != null) stack1.push(treeNode.right);
            if (treeNode.left != null) stack1.push(treeNode.left);
        }
        while (!stack2.empty()) {
            result.add(stack2.pop().val);
        }
        stack2.forEach(treeNode -> result.add(treeNode.val));
        return result;
    }
}
