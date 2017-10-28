package com.naveen.interviewBit.strings;

public class StringPermutation {

    public void printAllPermutation(String string) {
        if (string == null) return;
        printRecursively(string,0,string.length()-1);
    }

    private void printRecursively(String string, int st, int en) {
        if (st == en) {
            System.out.println(string);
            return;
        }
        for (int i = st; i <=en ; i++) {
            string = swap(string,st,i);
            printRecursively(string,st+1,en);
            string = swap(string,st,i);

        }

    }

    private String swap(String string, int i, int j) {
        if (i == j) return string;
        char[] chars = string.toCharArray();
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
        return String.valueOf(chars);
    }
}
