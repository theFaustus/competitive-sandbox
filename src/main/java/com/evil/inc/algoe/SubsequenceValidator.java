package com.evil.inc.algoe;

import java.util.List;
import java.util.Objects;

public class SubsequenceValidator {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size())
            return false;
        int currentSequenceIndex = 0;
        for (int i = 0; i < array.size() && currentSequenceIndex < sequence.size(); i++) {
            if (Objects.equals(array.get(i), sequence.get(currentSequenceIndex))) {
                currentSequenceIndex++;
            }
        }
        return currentSequenceIndex == sequence.size();
    }
}
