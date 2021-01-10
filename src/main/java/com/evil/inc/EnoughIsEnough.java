package com.evil.inc;

import java.util.Arrays;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int currentElementOccurrences = 0;
        for (int i = 0; i < elements.length; i++) {
            currentElementOccurrences = 0;
            for (int j = 0; j < elements.length; j++) {
                if (elements[i] == elements[j] && i != j) {
                    currentElementOccurrences++;
                    if (currentElementOccurrences >= maxOccurrences) {
                        elements = removeElement(elements, j);
                        System.out.println(Arrays.toString(elements));
                    }
                }
            }
        }
        return elements;
    }

    public static int[] removeElement(int[] original, int element) {
        int[] n = new int[original.length - 1];
        System.arraycopy(original, 0, n, 0, element);
        System.arraycopy(original, element + 1, n, element, original.length - element - 1);
        return n;
    }

}