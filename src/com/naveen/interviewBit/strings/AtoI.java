package com.naveen.interviewBit.strings;

public class AtoI {
    public int atoi(final String a) {
        int res = 0;
        int i=-1;
        int j=0;
        boolean isNeg = false;
        while (a.charAt(++i) == ' ');
        if (a.charAt(i) == '-' && Character.isDigit(a.charAt(i+1))) {
            isNeg = true;
            i++;
        } else {
            if (a.charAt(i) == '+' && Character.isDigit(a.charAt(i+1))) {
                isNeg = false;
                i++;
            }
        }

        for (; i <a.length() ; i++) {
            if (!Character.isDigit(a.charAt(i))) break;
            if (res<=(Integer.MAX_VALUE-9)/10) return isNeg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            res = res*10 + (a.charAt(i)-48);
        }
        return isNeg?-1*res:res;
    }
}
