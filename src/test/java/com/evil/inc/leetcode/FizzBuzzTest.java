package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void solve() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThat(fizzBuzz.solve(3)).isEqualTo(Arrays.asList("1", "2", "Fizz"));
        Assertions.assertThat(fizzBuzz.solve(5)).isEqualTo(Arrays.asList("1","2","Fizz","4","Buzz"));
        Assertions.assertThat(fizzBuzz.solve(15)).isEqualTo(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));
    }
}
