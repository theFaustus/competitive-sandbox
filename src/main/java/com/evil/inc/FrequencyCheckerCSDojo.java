package com.evil.inc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCheckerCSDojo {
    public static int findMostFrequentElement(int[] array){
        Map<Integer, Integer> integerToOccurrences = new HashMap<>();
        for (int j : array) {
            integerToOccurrences.merge(j, 1, Integer::sum);
        }
        return integerToOccurrences.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }

    //keep track of the the most occurred element using a map
    //optimize
    public static int findMostFrequentElementOptimized(int[] array){
        Map<Integer, Integer> integerToOccurrences = new HashMap<>();
        int mostFrequentElement = 0;
        int mostFrequentNumberOccurrences = 0;
        for (int j : array) {
            integerToOccurrences.merge(j, 1, Integer::sum);
            if(integerToOccurrences.get(j) > mostFrequentNumberOccurrences){
                mostFrequentNumberOccurrences = integerToOccurrences.get(j);
                mostFrequentElement = j;
            }
        }
        return mostFrequentElement;
    }
}
