package com.evil.inc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KPrimesKata {


    /**
     * A natural number is called k-prime if it has exactly k prime factors, counted with multiplicity. For example:
     * <p>
     * k = 2  -->  4, 6, 9, 10, 14, 15, 21, 22, ...
     * k = 3  -->  8, 12, 18, 20, 27, 28, 30, ...
     * k = 5  -->  32, 48, 72, 80, 108, 112, ...
     * A natural number is thus prime if and only if it is 1-prime.
     * <p>
     * Task:
     * Complete the function count_Kprimes (or countKprimes, count-K-primes, kPrimes) which is given parameters k, start, end (or nd) and returns an array (or a list or a string depending on the language - see "Solution" and "Sample Tests") of the k-primes between start (inclusive) and end (inclusive).
     * <p>
     * Example:
     * countKprimes(5, 500, 600) --> [500, 520, 552, 567, 588, 592, 594]
     * Notes:
     * <p>
     * The first function would have been better named: findKprimes or kPrimes :-)
     * In C some helper functions are given (see declarations in 'Solution').
     * For Go: nil slice is expected when there are no k-primes between start and end.
     */
    public static long[] countKprimes(int k, long start, long end) {
        Map<Long, Long> numberToPrimeDivisors = new HashMap<>();
        for (long i = start; i <= end; i++) {
            numberToPrimeDivisors.put(i, (long) findNumberOfKPrimes(i).size());
        }
        return numberToPrimeDivisors.entrySet().stream().filter(e -> e.getValue() == k).mapToLong(Map.Entry::getKey).sorted().toArray();
    }


    public static List<Long> findNumberOfKPrimes(long n) {
        List<Long> result = new ArrayList<>();
        long divisor = 2;
        while (divisor * divisor <= n) {
            while (n % divisor == 0) {
                result.add(divisor);
                n = n / divisor;
            }
            divisor++;
        }
        if (n > 1) result.add(n);
        return result;
    }

    public static int puzzle(int s) {
        //a, b, c = count_Kprimes(1, 2, s), count_Kprimes(3, 8, s), count_Kprimes(7, 128, s)
        //    return sum(i + j + k == s for i in a for j in b for k in c)

        long[] kprimes = countKprimes(7, 128, s);
        long[] kprimes1 = countKprimes(3, 8, s);
        long[] kprimes2 = countKprimes(1, 2, s);

        int sum = 0;
        for (long a : kprimes)
            for (long b : kprimes1)
                for (long c : kprimes2)
                    if (a + b + c == s)
                        sum++;
        return sum;
    }


}
