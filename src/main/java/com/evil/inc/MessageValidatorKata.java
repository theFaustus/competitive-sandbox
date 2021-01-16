package com.evil.inc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * In this kata, you have an input string and you should check whether it is a valid message. To decide that, you need to split the string by the numbers, and then compare the numbers with the number of characters in the following substring.
 * <p>
 * For example "3hey5hello2hi" should be split into 3, hey, 5, hello, 2, hi and the function should return true, because "hey" is 3 characters, "hello" is 5, and "hi" is 2; as the numbers and the character counts match, the result is true.
 * <p>
 * Notes:
 * <p>
 * Messages are composed of only letters and digits
 * Numbers may have multiple digits: e.g. "4code13hellocodewars" is a valid message
 * Every number must match the number of character in the following substring, otherwise the message is invalid: e.g. "hello5" and "2hi2" are invalid
 * If the message is an empty string, you should return true
 */
public class MessageValidatorKata {
    public static boolean isAValidMessage(String message) {
        if (message.isEmpty() || message.equals("0")) return true;
        if (!Character.isDigit(message.charAt(0))) return false;
        String[] digits = message.split("\\D+");
        List<String> words = Arrays.stream(message.split("\\d+")).filter(s -> !s.isEmpty()).collect(Collectors.toList());
        if (digits.length != words.size()) return false;
        for (int i = 0; i < words.size(); i++) {
            if (Integer.parseInt(digits[i]) != words.get(i).length())
                return false;
        }
        return true;
    }
}
