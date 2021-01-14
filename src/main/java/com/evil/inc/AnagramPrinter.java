package com.evil.inc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramPrinter {
    public static void main(String[] args) {
        String[] split = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ".split(" |\\!|,|\\?|\\.|_|'|@");
        long count = Arrays.stream(split)
                .filter(s -> !s.isEmpty())
                .count();
        System.out.println(count);
        Arrays.stream(split)
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        List<String> aa = Stream.of(a.toLowerCase().split("")).sorted().collect(Collectors.toList());
        List<String> bb = Stream.of(b.toLowerCase().split("")).sorted().collect(Collectors.toList());
        return aa.equals(bb);
    }

    static boolean isAnagramUsingArrays(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toLowerCase().toCharArray();
        char[] str2 = t.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    static boolean isAnagramUsingArray(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        for (int i = 0; i < aChars.length; i++) {
            for (int j = i + 1; j < bChars.length; j++) {
                if (aChars[i] > aChars[j]) {
                    char temp = aChars[i];
                    aChars[i] = aChars[j];
                    aChars[j] = temp;
                }
                if (bChars[i] > bChars[j]) {
                    char temp = bChars[i];
                    bChars[i] = bChars[j];
                    bChars[j] = temp;
                }
            }
        }

        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i])
                return false;
        }

        return true;
    }
}
