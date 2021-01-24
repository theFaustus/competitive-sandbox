package com.evil.inc;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static com.evil.inc.MixbonacciKata.*;
import static org.junit.Assert.*;

public class MixbonacciKataTest {
    private List<Long> fibonacciSequence;
    private List<Long> padovanSequence;
    private List<Long> jacobsthalSequence;
    private List<Long> pellSequence;
    private List<Long> tribonacciSequence;
    private List<Long> tetranacciSequence;

    @Before
    public void setUp() throws Exception {
        fibonacciSequence = new ArrayList<>();
        padovanSequence = new ArrayList<>();
        jacobsthalSequence = new ArrayList<>();
        pellSequence = new ArrayList<>();
        tribonacciSequence = new ArrayList<>();
        tetranacciSequence = new ArrayList<>();
    }

    @Test
    public void fibonacciTest() {
        for (int i = 0; i < 10; i++) {
            fibonacciSequence.add(fibonacci(i));
        }
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]", fibonacciSequence.toString());
    }

    @Test
    public void padovanTest() {
        for (int i = 0; i < 10; i++) {
            padovanSequence.add(padovan(i));
        }
        assertEquals("[1, 0, 0, 1, 0, 1, 1, 1, 2, 2]", padovanSequence.toString());
    }

    @Test
    public void jacobsthalTest() {
        for (int i = 0; i < 10; i++) {
            jacobsthalSequence.add(jacobsthal(i));
        }
        assertEquals("[0, 1, 1, 3, 5, 11, 21, 43, 85, 171]", jacobsthalSequence.toString());
    }

    @Test
    public void pellTest() {
        for (int i = 0; i < 10; i++) {
            pellSequence.add(pell(i));
        }
        assertEquals("[0, 1, 2, 5, 12, 29, 70, 169, 408, 985]", pellSequence.toString());
    }

    @Test
    public void tribonacciTest() {
        for (int i = 0; i < 10; i++) {
            tribonacciSequence.add(tribonacci(i));
        }
        assertEquals("[0, 0, 1, 1, 2, 4, 7, 13, 24, 44]", tribonacciSequence.toString());
    }

    @Test
    public void tetranacciTest() {
        for (int i = 0; i < 10; i++) {
            tetranacciSequence.add(tetranacci(i));
        }
        assertEquals("[0, 0, 0, 1, 1, 2, 4, 8, 15, 29]", tetranacciSequence.toString());
    }



    @Test
    public void fibonacciNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            fibonacciSequence.add(fibonacciNonRecursive(i));
        }
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]", fibonacciSequence.toString());
    }

    @Test
    public void padovanNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            padovanSequence.add(padovanNonRecursive(i));
        }
        assertEquals("[1, 0, 0, 1, 0, 1, 1, 1, 2, 2]", padovanSequence.toString());
    }

    @Test
    public void jacobsthalNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            jacobsthalSequence.add(jacobsthalNonRecursive(i));
        }
        assertEquals("[0, 1, 1, 3, 5, 11, 21, 43, 85, 171]", jacobsthalSequence.toString());
    }

    @Test
    public void pellNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            pellSequence.add(pellNonRecursive(i));
        }
        assertEquals("[0, 1, 2, 5, 12, 29, 70, 169, 408, 985]", pellSequence.toString());
    }

    @Test
    public void tribonacciNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            tribonacciSequence.add(tribonacciNonRecursive(i));
        }
        assertEquals("[0, 0, 1, 1, 2, 4, 7, 13, 24, 44]", tribonacciSequence.toString());
    }

    @Test
    public void tetranacciNonRecursiveTest() {
        for (int i = 0; i < 10; i++) {
            tetranacciSequence.add(tetranacciNonRecursive(i));
        }
        assertEquals("[0, 0, 0, 1, 1, 2, 4, 8, 15, 29]", tetranacciSequence.toString());
    }


    @Test
    public void SampleTests() {
        assertArrayEquals(convert(new int[]{}), MixbonacciKata.solve(new String[]{}, 0));
        assertArrayEquals(convert(new int[]{}), MixbonacciKata.solve(new String[]{"fib"}, 0));
        assertArrayEquals(convert(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}), MixbonacciKata.solve(new String[]{"fib"}, 10));
        assertArrayEquals(convert(new int[]{1, 0, 0, 1, 0, 1, 1, 1, 2, 2}), MixbonacciKata.solve(new String[]{"pad"}, 10));
        assertArrayEquals(convert(new int[]{0, 1, 1, 3, 5, 11, 21, 43, 85, 171}), MixbonacciKata.solve(new String[]{"jac"}, 10));
        assertArrayEquals(convert(new int[]{0, 1, 2, 5, 12, 29, 70, 169, 408, 985}), MixbonacciKata.solve(new String[]{"pel"}, 10));
        assertArrayEquals(convert(new int[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}), MixbonacciKata.solve(new String[]{"tri"}, 10));
        assertArrayEquals(convert(new int[]{0, 0, 0, 1, 1, 2, 4, 8, 15, 29}), MixbonacciKata.solve(new String[]{"tet"}, 10));
        assertArrayEquals(convert(new int[]{0, 0, 1, 0, 1, 0, 2, 1, 3, 1}), MixbonacciKata.solve(new String[]{"fib", "tet"}, 10));
        assertArrayEquals(convert(new int[]{0, 1, 0, 1, 3, 1, 5, 11, 2, 21}), MixbonacciKata.solve(new String[]{"jac", "jac", "pel"}, 10));
    }


    private BigInteger[] convert(int[] array) {
        BigInteger[] exp = new BigInteger[array.length];
        for (int i = 0; i < array.length; i++) {
            exp[i] = BigInteger.valueOf(array[i]);
        }
        return exp;
    }
}