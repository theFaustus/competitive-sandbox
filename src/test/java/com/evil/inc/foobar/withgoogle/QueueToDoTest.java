package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Queue;

import static org.junit.Assert.*;

public class QueueToDoTest {

    @Test
    public void solution() {
        Assertions.assertThat(QueueToDo.solution(0, 3)).isEqualTo(2);
    }

    @Test
    public void solution2() {
        Assertions.assertThat(QueueToDo.solution(17, 4)).isEqualTo(14);
    }

    @Test
    public void checksum() {
        Assertions.assertThat(QueueToDo.checksum(Arrays.asList(0, 1, 2, 3, 4, 6))).isEqualTo(2);
        Assertions.assertThat(QueueToDo.checksum(Arrays.asList(17, 18, 19, 20, 21, 22, 23, 25, 26, 29))).isEqualTo(14);
    }
}