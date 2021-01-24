package com.evil.inc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberOfIslandsSolverTest {

    @Test
    public void getSizesOfIslands() {
        Assertions.assertThat(NumberOfIslandsSolver.getSizesOfIslands(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 1, 0, 0, 1}
        })).isEqualTo(new int[]{6, 2, 2, 2, 1});

        Assertions.assertThat(NumberOfIslandsSolver.getSizesOfIslands(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1}
        })).isEqualTo(new int[]{8, 2, 1, 1});

        Assertions.assertThat(NumberOfIslandsSolver.getSizesOfIslands(new int[][]{
                {0, 0, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 1, 0, 0, 1}
        })).isEqualTo(new int[]{1, 5, 2, 2, 2, 1});
    }
}