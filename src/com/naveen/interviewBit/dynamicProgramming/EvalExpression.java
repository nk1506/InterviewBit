package com.naveen.interviewBit.dynamicProgramming;

/**
 Given expression with operands and operators (OR , AND , XOR) , in how many ways can you evaluate the expression to true, by grouping in different ways? Operands are only true and false.
 Input:

 string :  T|F&T^T
 here '|' will represent or operator
 '&' will represent and operator
 '^' will represent xor operator
 'T' will represent true operand
 'F' will false

 Output:

 different ways % MOD
 where MOD = 1003


 */

public class EvalExpression {
    public int cnttrue(String A) {
        int res =0;

        return res;
    }

    private int rec(String A, int st, int en) {
        if (en<=st) return 0;
        return 0;
    }
}
