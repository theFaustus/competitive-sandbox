package com.evil.inc;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RegexBuddy {
    public static List<String> split(String s) {
        return Stream.of(s.split(" |\\!|,|\\?|\\.|_|'|@"))
                .filter(ss -> !ss.isEmpty())
                .collect(Collectors.toList());
    }

    public static String replaceDuplicates(String s){
        return s.replaceAll("\\b(?i)(\\w+)(?:\\s+\\1\\b)+", "$1");
    }
}
