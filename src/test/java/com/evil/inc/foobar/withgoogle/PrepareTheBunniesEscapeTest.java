package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrepareTheBunniesEscapeTest {

    @Test
    public void solution() {
        Assertions.assertThat(
                        PrepareTheBunniesEscape.solution(new int[][]{
                                {0, 1, 1, 0},
                                {0, 0, 0, 1},
                                {1, 1, 0, 0},
                                {1, 1, 1, 0}}))
                .isEqualTo(7);
    }


    @Test
    public void solution2() {
        Assertions.assertThat(
                        PrepareTheBunniesEscape.solution(
                                new int[][]{
                                        {0, 0, 0, 0, 0, 0},
                                        {1, 1, 1, 1, 1, 0},
                                        {0, 0, 0, 0, 0, 0},
                                        {0, 1, 1, 1, 1, 1},
                                        {0, 1, 1, 1, 1, 1},
                                        {0, 0, 0, 0, 0, 0}}))
                .isEqualTo(11);
    }

    @Test
    public void solution3() {
        Assertions.assertThat(
                        PrepareTheBunniesEscape.solution(
                                new int[][]{
                                        {0, 0, 0, 0, 0, 0},
                                        {1, 1, 1, 1, 1, 0},
                                        {0, 0, 0, 0, 0, 0},
                                        {0, 1, 1, 1, 0, 1},
                                        {0, 1, 1, 1, 1, 1},
                                        {0, 0, 0, 0, 0, 0}}))
                .isEqualTo(11);
    }
}