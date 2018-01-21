package com.naveen.interviewBit.dynamicProgramming;

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
 * @since 28/12/17
 */

public class N3Board {
    public int solve(int A) {
        long t = 24;
        long d = 12;


        for (int i = 2; i <=A ; i++) {
            long tempT  = (t*11)%1000000007 + (d*10)%1000000007;
            long tempD = (t*5)%1000000007 + (d*7)%1000000007;
            t = tempT%1000000007;
            d = tempD%1000000007;
        }

        return (int)(t+d)%1000000007;
    }
}
