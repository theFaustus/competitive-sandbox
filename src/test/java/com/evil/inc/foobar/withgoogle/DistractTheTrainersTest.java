package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistractTheTrainersTest {

    @Test
    public void solution() {
        Assertions.assertThat(DistractTheTrainers.solution(new int[]{1, 1})).isEqualTo(2);
    }


    @Test
    public void solution2() {
        Assertions.assertThat(DistractTheTrainers.solution(new int[]{1, 7, 3, 21, 13, 19})).isEqualTo(0);
    }
}