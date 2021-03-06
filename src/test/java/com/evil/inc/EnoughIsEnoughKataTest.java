package com.evil.inc;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class EnoughIsEnoughKataTest {


    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(new int[]{3, 4, 5, 0, 7, 6}, EnoughIsEnoughKata.deleteNth(new int[]{3, 4, 5, 3, 3, 0, 7, 6}, 1));

        assertArrayEquals(new int[]{4, 10, 6, 11, 8, 2, 3, 0}, EnoughIsEnoughKata.deleteNth(new int[]{4, 10, 6, 11, 8, 2, 4, 3, 8, 0, 2, 2}, 1));

        assertArrayEquals(
                new int[]{20, 37, 21},
                EnoughIsEnoughKata.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnoughKata.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnoughKata.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                EnoughIsEnoughKata.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                EnoughIsEnoughKata.deleteNth(new int[]{}, 5)
        );

    }

    @Test
    public void deleteNthBetterApproach() throws Exception {
        assertArrayEquals(new int[]{3, 4, 5, 0, 7, 6}, EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{3, 4, 5, 3, 3, 0, 7, 6}, 1));

        assertArrayEquals(new int[]{4, 10, 6, 11, 8, 2, 3, 0}, EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{4, 10, 6, 11, 8, 2, 4, 3, 8, 0, 2, 2}, 1));

        assertArrayEquals(
                new int[]{20, 37, 21},
                EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                EnoughIsEnoughKata.deleteNthBetterApproach(new int[]{}, 5)
        );

    }

}