package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class ZigZagLevelTraverse {
    public ArrayList<ArrayList<Integer>> solution(TreeNode a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(a);
        ArrayList<Integer> list;
        while (!stack1.empty() || !stack2.empty()) {
            list = new ArrayList<>();
            while (!stack1.empty()) {
                TreeNode temp = stack1.pop();
                if (temp.left!=null)stack2.push(temp.left);
                if (temp.right!=null)stack2.push(temp.right);
                list.add(temp.val);
            }
            if (!list.isEmpty()) {
                result.add(list);
            }

            list = new ArrayList<>();
            while (!stack2.empty()) {
                TreeNode temp = stack2.pop();
                if (temp.right!=null)stack1.push(temp.right);
                if (temp.left!=null)stack1.push(temp.left);
                list.add(temp.val);
            }

            if (!list.isEmpty())
            result.add(list);
        }
        return result;

    }
}
