package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolarDoomsdayTest {

    @Test
    public void solution() {
        Assertions.assertThat(SolarDoomsday.solution(12)).isEqualTo(new int[]{9, 1, 1, 1});
    }

    @Test
    public void solution2() {
        Assertions.assertThat(SolarDoomsday.solution(15324)).isEqualTo(new int[]{15129, 169, 25, 1});
    }
}