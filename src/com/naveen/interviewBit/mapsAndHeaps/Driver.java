package com.naveen.interviewBit.mapsAndHeaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

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
 * @since 01/01/18
 */

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2147483647);
        list.add(2000000014);
        list.add(2147483647);
        MagicianAndChocklates magicianAndChocklates = new MagicianAndChocklates();
        int x = magicianAndChocklates.nchoc(10,list);
        return;
    }
}
