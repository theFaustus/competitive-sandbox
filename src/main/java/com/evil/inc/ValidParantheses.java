package com.evil.inc;

import java.util.Stack;

public class ValidParantheses {

    public static boolean check(String s) {
        if (s == null || s.isEmpty() || s.length() <= 1)
            return false;
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                brackets.push(']');
            } else if (s.charAt(i) == '{') {
                brackets.push('}');
            } else if (s.charAt(i) == '(') {
                brackets.push(')');
            } else {
                if (brackets.isEmpty() || s.charAt(i) != brackets.peek()) {
                    return false;
                }
                brackets.pop();
            }
        }
        return brackets.isEmpty();
    }
}
