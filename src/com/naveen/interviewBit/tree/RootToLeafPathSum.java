package com.naveen.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

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

public class RootToLeafPathSum {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private int b;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        this.b = B;
        if (A== null) return result;
        pathSumValid(A,0,new ArrayList<>());
        return result;


    }

    private void pathSumValid(TreeNode a, int s, ArrayList<Integer> list) {
        if (a == null) return;
        if (a.left == null && a.right == null ) {
            if (((s+a.val) == b)) {
                list.add(a.val);
                result.add(list);
                list.remove(list.size()-1);
            }
            return;
        }
        list.add(a.val);
        s+=a.val;
        pathSumValid(a.left,s,list);
        pathSumValid(a.right,s,list);
        list.remove(list.size()-1);
    }
}
