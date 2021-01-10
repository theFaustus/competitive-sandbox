package com.evil.inc;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class EnoughIsEnoughTest {


    /*
    * [44, 43, 39, 15, 15, 12, 48, 5, 33, 25, 4, 62, 36, 5, 16, 18, 55, 7, 48, 36, 23, 22, 47, 3, 16, 6, 6, 27, 12, 40, 17, 59, 55, 10, 27, 22, 1, 55, 30, 8, 35, 42, 6, 50, 9, 13, 24, 46, 7, 12, 60, 39, 59, 14, 46, 53, 10, 43, 11, 55, 11, 28, 44]

3
    * */
    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(new int[]{3, 4, 5, 0, 7, 6}, EnoughIsEnough.deleteNth(new int[]{3, 4, 5, 3, 3, 0, 7, 6}, 1));

        assertArrayEquals(new int[]{4, 10, 6, 11, 8, 2, 3, 0}, EnoughIsEnough.deleteNth(new int[]{4, 10, 6, 11, 8, 2, 4, 3, 8, 0, 2, 2}, 1));

        assertArrayEquals(
                new int[]{20, 37, 21},
                EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                EnoughIsEnough.deleteNth(new int[]{}, 5)
        );

    }

}