package com.evil.inc;

/**
 * Buddy pairs
 * You know what divisors of a number are. The divisors of a positive integer n are said to be proper when you consider only the divisors other than n itself. In the following description, divisors will mean proper divisors. For example for 100 they are 1, 2, 4, 5, 10, 20, 25, and 50.
 * <p>
 * Let s(n) be the sum of these proper divisors of n. Call buddy two positive integers such that the sum of the proper divisors of each number is one more than the other number:
 * <p>
 * (n, m) are a pair of buddy if s(m) = n + 1 and s(n) = m + 1
 * <p>
 * For example 48 & 75 is such a pair:
 * <p>
 * Divisors of 48 are: 1, 2, 3, 4, 6, 8, 12, 16, 24 --> sum: 76 = 75 + 1
 * Divisors of 75 are: 1, 3, 5, 15, 25 --> sum: 49 = 48 + 1
 * Task
 * Given two positive integers start and limit, the function buddy(start, limit) should return the first pair (n m) of buddy pairs such that n (positive integer) is between start (inclusive) and limit (inclusive); m can be greater than limit and has to be greater than n
 * <p>
 * If there is no buddy pair satisfying the conditions, then return "Nothing" or (for Go lang) nil or (for Dart) null; (for Pascal) [-1, -1].
 * <p>
 * Examples
 * (depending on the languages)
 * <p>
 * buddy(10, 50) returns [48, 75]
 * buddy(48, 50) returns [48, 75]
 * or
 * buddy(10, 50) returns "(48 75)"
 * buddy(48, 50) returns "(48 75)"
 */
class AmicablePair {
    public static String buddy(long start, long limit) {
        for (long n = start; n < limit; n++) {
            long m = getSumOfDivisors(n) - 1;
            if (m > n && getSumOfDivisors(m) - 1 == n) return "(" + n + " " + m + ")";
        }

        return "Nothing";
    }


    /**
     * This problem has very simple solution, we all know that for any number ‘num’ all its
     * divisors are always less than and equal to ‘num/2’ and all prime factors are always
     * less than and equal to sqrt(num). So we iterate through ‘i’ till i<=sqrt(num) and
     * for any 'i' if it divides 'num' , then we get two divisors 'i' and 'num/i' , continuously
     * add these divisors but for some numbers divisors 'i' and 'num/i' will same in this
     * case just add only one divisor , e.g; num=36 so for i=6 we will get (num/i)=6 ,
     * that's why we will at 6 in the summation only once. Finally we add one as one is divisor
     * of all natural numbers.
     */
    public static long getSumOfDivisors(long number) {
        long sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            System.out.println(number);
            if (number % i == 0) {
                if (i == (number / i)) {
                    sum += i; // add just divisor 4 % 2 = 2 -> 2 == 2 -> need just one
                } else {
                    sum += (i + number / i); // add both the divisor and result 10 % 5 = 2 -> 5 != 2 -> need both
                }
            }
        }
        return sum;
    }
}
