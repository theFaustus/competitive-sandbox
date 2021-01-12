package com.evil.inc;


/**
 *Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 */
public class IntegerReverser {
    public int reverse(int x) {
        int result = 0;
        long overUnderFlowResult = 0;
        while (x != 0){
            if(overUnderFlowResult > Integer.MAX_VALUE || overUnderFlowResult < Integer.MIN_VALUE)
                return 0;
            result = result * 10 + x % 10;
            overUnderFlowResult = (long) result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
