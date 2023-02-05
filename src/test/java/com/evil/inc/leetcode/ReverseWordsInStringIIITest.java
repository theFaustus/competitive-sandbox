package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringIIITest {

    @Test
    void reverseWords() {
        ReverseWordsInStringIII reverseWordsInStringIII = new ReverseWordsInStringIII();
        Assertions.assertThat(reverseWordsInStringIII.reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
        Assertions.assertThat(reverseWordsInStringIII.reverseWords("God Ding")).isEqualTo("doG gniD");

    }
}
