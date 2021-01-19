package com.evil.inc;

public class SectionKata {
    /**
     * Consider the following equation of a surface S: z*z*z = x*x * y*y. Take a cross section of S by a plane P: z = k where k is a positive integer (k > 0).
     * Call this cross section C(k).
     * <p>
     * Task
     * Find the number of points of C(k) whose coordinates are positive integers.
     * <p>
     * Examples
     * If we call c(k) the function which returns this number we have
     * <p>
     * c(1) -> 1
     * c(4) -> 4
     * c(4096576) -> 160
     * c(2019) -> 0 which means that no point of C(2019) has integer coordinates.
     * <p>
     * Notes
     * k can go up to about 10,000,000,000
     * Prolog: the function cis called section.
     * Please could you ask before translating : some translations are already written.
     */
    public static int c(long k) {

        //S: z*z*z = x*x * y*y.
        //S: z^3 = x^2 * y^2

        double n = Math.sqrt(k);
        double floor = Math.floor(n);
        int numberOfResults = 1;
        if (floor != n) return 0;
        for (int i = 2; i <= n; i++) {
            if (n % i != 0) continue;
            int count = 0;
            while (n % i == 0) {
                n = n / i;
                count++;
            }
            numberOfResults *= ((count - 1) * 3) + 4;
        }

        return numberOfResults;
    }

}
