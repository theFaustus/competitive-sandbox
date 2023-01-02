package com.evil.inc;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<Integer> findNumberOfPermutationsFor(String source, String destination){
        List<Integer> permutationIndexes = new ArrayList<>();
        String sortedSource = source.chars().boxed().sorted().map(Object::toString).reduce("", String::concat);

        for (int i = 0; i < destination.length() - 3; i++) {
            String substring = destination.substring(i, i + 4);
            String sortedSubstring = substring.chars().boxed().sorted().map(Object::toString).reduce("", String::concat);
            if (sortedSource.equals(sortedSubstring)){
                permutationIndexes.add(i);
            }
        }

        System.out.println(permutationIndexes);
        return permutationIndexes;
    }
}
