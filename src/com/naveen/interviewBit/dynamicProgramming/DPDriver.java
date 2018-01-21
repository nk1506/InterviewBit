package com.naveen.interviewBit.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

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
 * @since 25/12/17
 */

public class DPDriver {
    public static void main(String[] args) {
        CoinsInALine kthManhattan = new CoinsInALine();
        ArrayList<Integer> row2 = new ArrayList<>(); //[ 46, 12, 42, 67 ]
        row2.add(46);
        row2.add(12);
        row2.add(42);
        row2.add(67);
        int x = kthManhattan.maxcoin(row2);
        System.out.println(x);
        return;
    }
}
