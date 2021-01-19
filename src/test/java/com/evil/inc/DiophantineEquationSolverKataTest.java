package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiophantineEquationSolverKataTest {

    @Test
    public void test1() {
        assertEquals("[[3, 1]]", DiophantineEquationSolverKata.solve(5));
    }

    @Test
    public void test2() {
        assertEquals("[[4, 1]]", DiophantineEquationSolverKata.solve(12));
    }

    @Test
    public void test3() {
        assertEquals("[[7, 3]]", DiophantineEquationSolverKata.solve(13));
    }

    @Test
    public void test4() {
        assertEquals("[[4, 0]]", DiophantineEquationSolverKata.solve(16));
    }

    @Test
    public void test5() {
        assertEquals("[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]", DiophantineEquationSolverKata.solve(90005));
    }

    @Test
    public void test6() {
        assertEquals("[[3, 1]]", DiophantineEquationSolverKata.solveSecond(5));
    }

    @Test
    public void test7() {
        assertEquals("[[4, 1]]", DiophantineEquationSolverKata.solveSecond(12));
    }

    @Test
    public void test8() {
        assertEquals("[[7, 3]]", DiophantineEquationSolverKata.solveSecond(13));
    }

    @Test
    public void test9() {
        assertEquals("[[4, 0]]", DiophantineEquationSolverKata.solveSecond(16));
    }

    @Test
    public void test10() {
        assertEquals("[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]", DiophantineEquationSolverKata.solveSecond(90005));
    }

    @Test
    public void test11() {
        assertEquals("[[450000005, 225000002], [150000003, 75000000], [50000005, 24999998], [26470597, 13235290], [8823555, 4411752], [2941253, 1470550]]", DiophantineEquationSolverKata.solveSecond(900000009));
    }
}