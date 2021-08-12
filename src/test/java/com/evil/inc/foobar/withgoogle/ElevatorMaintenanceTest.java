package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElevatorMaintenanceTest {

    @Test
    public void solution() {
        Assertions.assertThat(ElevatorMaintenance.solution(
                        new String[]{"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"}))
                .isEqualTo(new String[]{"0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0"});
    }

    @Test
    public void solution2() {
        Assertions.assertThat(ElevatorMaintenance.solution(
                        new String[]{"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"}))
                .isEqualTo(new String[]{"1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"});
    }
}