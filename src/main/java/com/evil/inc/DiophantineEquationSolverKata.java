package com.evil.inc;

public class DiophantineEquationSolverKata {
    /**
     * In mathematics, a Diophantine equation is a polynomial equation, usually with two or more unknowns, such that only the integer solutions are sought or studied.
     * <p>
     * In this kata we want to find all integers x, y (x >= 0, y >= 0) solutions of a diophantine equation of the form:
     * <p>
     * x2 - 4 * y2 = n
     * (where the unknowns are x and y, and n is a given positive number) in decreasing order of the positive xi.
     * <p>
     * If there is no solution return [] or "[]" or "". (See "RUN SAMPLE TESTS" for examples of returns).
     * <p>
     * Examples:
     * solEquaStr(90005) --> "[[45003, 22501], [9003, 4499], [981, 467], [309, 37]]"
     * solEquaStr(90002) --> "[]"
     * <p>
     * Hint:
     * x2 - 4 * y2 = (x - 2*y) * (x + 2*y) = n
     *
     * x = (x - 2y) + 2y
     * x = (x + 2y) - 2y
     * y = ((x + 2y - 2y) - x - 2y) / 4
     *
     * <p>
     * x / y = q, r
     * x = y * q + r
     * 1 = 4 * 0 + 1
     * <p>
     * y / x = q, r
     * y = x * q + r
     * 4 = 1 * 0 + 4
     * <p>
     * 1 = 4 * 0 + 1
     * <p>
     * <p>
     * x = 1 2 3 4 5 6 7 8 9
     * y = 1 2 3 4 5 6 7 8 9
     */
    public static String solve(long n) {
        if (n < 0)
            return "[]";
        StringBuilder result = new StringBuilder("[");
        int numberOfResults = 0;
        for (long x = n / 2 + 1; x >= 0; x--) {
            for (long y = n / 4 + 1; y >= 0; y--) {
                if ((x - 2 * y) * (x + 2 * y) == n) {
                    if (numberOfResults == 0) {
                        result.append("[").append(x).append(", ").append(y).append("]");
                    } else {
                        result.append(", [").append(x).append(", ").append(y).append("]");
                    }
                    numberOfResults++;
                }
            }
        }
        result.append("]");
        return result.toString();
    }

    public static String solveSecond(long n) {
        if (n < 0)
            return "[]";
        StringBuilder result = new StringBuilder("[");
        int numberOfResults = 0;
        for (long a = 1; a < ((long) Math.pow(n, 0.5) + 1) + 1; a++) {
            if (n % a == 0) {
                long b = n / a;
                if ((a + b) % 2 == 0 && (b - a) % 4 == 0) {
                    if (numberOfResults == 0) {
                        result.append("[").append((a + b) / 2).append(", ").append((b - a) / 4).append("]");
                    } else {
                        result.append(", [").append((a + b) / 2).append(", ").append((b - a) / 4).append("]");
                    }
                    numberOfResults++;
                }

            }
        }
        result.append("]");
        return result.toString();
    }


}
