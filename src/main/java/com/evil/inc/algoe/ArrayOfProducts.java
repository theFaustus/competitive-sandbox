package com.evil.inc.algoe;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int j = array.length - 1; j >= 0; j--) {
                if(i != j){
                    product *= array[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
}
