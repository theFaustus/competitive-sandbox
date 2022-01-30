package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassPhotosTest {

    @Test
    public void classPhotos() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        Assertions.assertThat(expected).isEqualTo(actual);
    }
}
