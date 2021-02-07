package com.evil.inc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GapInPrimesKata {
    /**
     * The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2.
     * From 7 to 11 it is 4. Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43
     * <p>
     * A prime gap of length n is a run of n-1 consecutive composite numbers between two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).
     * <p>
     * We will write a function gap with parameters:
     * <p>
     * g (integer >= 2) which indicates the gap we are looking for
     * <p>
     * m (integer > 2) which gives the start of the search (m inclusive)
     * <p>
     * n (integer >= m) which gives the end of the search (n inclusive)
     * <p>
     * n won't go beyond 1100000.
     * <p>
     * In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.
     * <p>
     * So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n
     * if these numbers exist otherwise `nil or null or None or Nothing (or ... depending on the language).
     * <p>
     * In C++: return in such a case {0, 0}. In F#: return [||]. In Kotlin, Dart and Prolog: return []. In Pascal: return Type TGap (0, 0).
     * <p>
     * Examples:
     * gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}
     * <p>
     * gap(2, 5, 5) --> nil. In C++ {0, 0}. In F# [||]. In Kotlin, Dart and Prolog return []`
     * <p>
     * gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}
     * <p>
     * ([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)
     * <p>
     * gap(6,100,110) --> nil or {0, 0} or ... : between 100 and 110 we have 101, 103, 107, 109 but 101-107is not a 6-gap
     * because there is 103in between and 103-109is not a 6-gap because there is 107in between.
     * <p>
     * You can see more examples of return in Sample Tests.
     */
    public static long[] gap(int g, long m, long n) {
        List<Long> primes = findPrimes(m, n);
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++) {
            if (i + 1 < primes.size() && primes.get(i + 1) - primes.get(i)  == g) {
                result.add(primes.get(i));
                result.add(primes.get(i + 1));
                break;
            }
        }

        if (result.isEmpty()) return null;
        return result.stream().mapToLong(l -> l).toArray();
    }

    public static long[] gapClever(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }

        return null;
    }


    public static List<Long> findPrimes(long m, long n) {
        List<Long> primeNumbers = new LinkedList<>();
        if (n == 2) {
            primeNumbers.add(2L);
        }
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(long number) {
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
