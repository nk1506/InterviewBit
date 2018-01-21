package com.naveen.interviewBit.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextPointer {
    public void connect(TreeLinkNode root) {
        if (root == null) return;

        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeLinkNode treeLinkNode = queue.poll();
            if (treeLinkNode == null) {
                if (!queue.isEmpty()) queue.add(null);
                continue;
            }
            treeLinkNode.next = queue.peek();
            if (treeLinkNode.left != null) queue.add(treeLinkNode.left);
            if (treeLinkNode.right != null) queue.add(treeLinkNode.right);
        }

    }
}
