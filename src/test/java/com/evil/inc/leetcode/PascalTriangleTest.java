package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    @Test
    public void generate() {
        PascalTriangle pascalTriangle = new PascalTriangle();

        Assertions.assertThat(pascalTriangle.generate(5)).isEqualTo(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        ));

        Assertions.assertThat(pascalTriangle.generate(1)).isEqualTo(List.of(List.of(1)));
    }
}
