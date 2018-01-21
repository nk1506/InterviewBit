package com.naveen.interviewBit.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ADOBE CONFIDENTIAL ___________________
 * <p>
 * Copyright 2011 Adobe Systems Incorporated All Rights Reserved.
 * <p>
 * NOTICE: All information contained herein is, and remains the property of
 * Adobe Systems Incorporated and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Adobe Systems
 * Incorporated and its suppliers and may be covered by U.S. and Foreign
 * Patents, patents in process, and are protected by trade secret or copyright
 * law. Dissemination of this information or reproduction of this material is
 * strictly forbidden unless prior written permission is obtained from Adobe
 * Systems Incorporated.
 *
 * @author navkumar@adobe.com
 * @file ${FILE_NAME}
 * @since 07/01/18
 */

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
