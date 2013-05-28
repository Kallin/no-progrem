package com.noproglem

public class Util {

    // try dividing by 2, then 3, then 4, then 5... up to test/2
    // if you find a factor, then test/factor is also a factor.
    // you can then change the end point to test/factor
    // returns a list of factor-pairs
    public static List<List<Long>> factor(long test, boolean quitOnNotPrime) {
        if (test == 0)
            throw new RuntimeException("0 has infinitely many factors")
        if (test < 0)
            throw new RuntimeException("We don't currently support negatives")

        List<List<Long>> factorPairs = []
        factorPairs << [1, test]

        long end = (test / 2)

        def possibleFactor = 2
        while (possibleFactor <= end) {

            if (test % possibleFactor == 0) {
                final otherFactor = test / possibleFactor
                end = otherFactor - 1
                factorPairs << [(long) possibleFactor, (long) otherFactor]
                if (quitOnNotPrime)
                    return factorPairs
            }
            possibleFactor++
        }

        return factorPairs
    }

    public static List<List<Long>> factor(long test) {
        factor(test, false)
    }

    public static boolean isPrime(long test) {
        return factor(test, true).size() == 1
    }

    // Sieve of Eratosthenes
    public static Set<Long> findPrimes(long max) {
        if (max <= 1)
            throw new RuntimeException("unable to find primes for numbers not greater than 1")

        def composites = findComposites(max)
        final range = (2..max) as Set
        range.removeAll(composites)
        return range as Set
    }

    // find all composite (non-primes) up to a given value
    public static Set<Long> findComposites(Long max) {
        if (max < 2)
            throw new RuntimeException("unable to calculate composites for negative numbers")

        def composites = new HashSet<Long>()
        if (max < 4)
            return composites

        final midway = max / 2
        for (test in (2..midway)) {
            if (composites.contains(test))
                continue

            def multiplier = 2
            def multiple
            while ((multiple = test * multiplier) <= max) {
                composites << multiple.toLong()
                multiplier++
            }
        }

        return composites
    }

}
