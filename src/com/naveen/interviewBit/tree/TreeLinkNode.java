package com.naveen.interviewBit.tree;

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

public class TreeLinkNode {
    public TreeLinkNode left;
    public TreeLinkNode right;
    public TreeLinkNode next;

    public TreeLinkNode(TreeLinkNode left, TreeLinkNode right, TreeLinkNode next) {
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
