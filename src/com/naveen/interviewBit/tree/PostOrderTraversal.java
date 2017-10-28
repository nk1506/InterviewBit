package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {

    public ArrayList<Integer> postOrder(TreeNode a) {
        return nonRecursive(a);
    }

    private ArrayList<Integer> nonRecursive(TreeNode a) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode temp = a;
        stack1.push(temp);
        while (!stack1.empty()) {
            temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) stack1.push(temp.left);
            if (temp.right != null) stack1.push(temp.right);
        }
        while (!stack2.empty()) {
            list.add(stack2.pop().val);
        }
        return list;
    }

    private void recursive(TreeNode a , ArrayList<Integer> arrayList) {
        if (a == null) return;
        recursive(a.left,arrayList);
        recursive(a.right, arrayList);
        arrayList.add(a.val);
        return;
    }

}
