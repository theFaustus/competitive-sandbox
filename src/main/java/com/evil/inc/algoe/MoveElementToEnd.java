package com.evil.inc.algoe;

import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        System.out.println(array);
        int lastIndex = array.size() - 1;
        for (int i = array.size() - 1; i >= 0; i--) {
            if(array.get(i) == toMove){
                swap(array, i, lastIndex);
                lastIndex--;
                System.out.println(array);
            }
        }
        return array;
    }

    public static void swap(List<Integer> array, int from, int to){
        final Integer fromInteger = array.get(from);
        final Integer toInteger = array.get(to);
        array.set(from, toInteger);
        array.set(to, fromInteger);
    }
}
