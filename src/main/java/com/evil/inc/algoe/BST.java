package com.evil.inc.algoe;

public class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    public BST insert(int value) {
        if(value < this.value){
            if(left == null){
                left = new BST(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null){
                right = new BST(value);
            } else {
                right.insert(value);
            }
        }

        return this;
    }

    public boolean contains(int value) {
        if(value == this.value) return true;
        if(value < this.value){
            if(left == null){
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if(right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public BST remove(int value) {
        // Write your code here.
        // Do not edit the return statement of this method.
        return this;
    }

    @Override
    public String toString() {
        return "BST{" +
                "value=" + value + '}';
    }
}
