package com.evil.inc;

import java.util.Map;
import java.util.Stack;

public class BracketsParser {
    boolean isBalanced(String line){
        Stack<Character> characters = new Stack<>();
        for(Character c : line.toCharArray()){
            switch(c){
                case '{': characters.push('}'); break;
                case '(': characters.push(')'); break;
                case '[': characters.push(']'); break;
                default:
                    if(characters.isEmpty() || c != characters.peek()) return false;
                    characters.pop();
            }
        }
        return characters.isEmpty();
    }
}