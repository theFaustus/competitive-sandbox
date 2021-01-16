package com.evil.inc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EnoughIsEnoughKata {

    public static int[] deleteNthBetterApproach(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        return IntStream.of(elements)
                .filter(element -> occurrence.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if (maxOccurrences == 0) {
            elements = new int[]{};
        }
        int currentElementOccurrences = 0;
        for (int i = 0; i < elements.length; i++) {
            currentElementOccurrences = 0;
            for (int j = 0; j < elements.length; j++) {
                if (i >= elements.length)
                    continue;
                if (elements[i] == elements[j] && i != j) {
                    currentElementOccurrences++;
                    if (currentElementOccurrences >= maxOccurrences) {
                        System.out.println(elements[i] + "@" + i);
                        System.out.println(elements[j] + "@" + j);
                        elements = removeElement(elements, j);
                        System.out.println(Arrays.toString(elements));
                        --j; //decrease the index after removing
                    }
                }
            }
        }
        return elements;
    }

    public static int[] removeElement(int[] original, int element) {
        int[] copy = new int[original.length - 1];
        System.arraycopy(original, 0, copy, 0, element);
        System.arraycopy(original, element + 1, copy, element, original.length - element - 1);
        return copy;
    }

}