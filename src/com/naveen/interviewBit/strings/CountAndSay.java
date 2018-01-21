package com.naveen.interviewBit.strings;

public class CountAndSay {
    public String countAndSay(int a) {
        String res = "11";
        for (int i=3;i<=a;i++) {
            res = nextString(res);
        }
        return res;

    }

    private String nextString(String string) {
        StringBuilder builder = new StringBuilder();
        char ch = string.charAt(0);
        int k =1;
        for (int i = 1; i<string.length(); i++) {
            if ( ch == string.charAt(i)) k++;
            else {
                builder.append(k);
                builder.append(ch);
                k=1;
                ch = string.charAt(i);
            }
        }
        builder.append(k);
        builder.append(ch);
        return builder.toString();
    }
}
