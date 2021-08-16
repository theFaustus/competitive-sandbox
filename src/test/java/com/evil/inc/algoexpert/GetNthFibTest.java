package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetNthFibTest {

    @Test
    public void getNthFib() {
        Assertions.assertThat(GetNthFib.getNthFib(6)).isEqualTo(5);
    }


    @Test
    public void getNthFibMemoize() {
        Assertions.assertThat(GetNthFib.getNthFibMemoize(6)).isEqualTo(5);
    }
}