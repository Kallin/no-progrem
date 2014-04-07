package com.noproglem

@SuppressWarnings('DuplicateNumberLiteral')
class Util {

    // try dividing by 2, then 3, then 4, then 5... up to test/2
    // if you find a factor, then test/factor is also a factor.
    // you can then change the end point to test/factor
    // returns a list of factor-pairs
    static List<List<Long>> factor(long test, boolean quitOnNotPrime) {
        if (test == 0)
            throw new IllegalArgumentException('0 has infinitely many factors')
        if (test < 0)
            throw new IllegalArgumentException('We don\'t currently support negatives')

        List<List<Long>> factorPairs = []
        factorPairs << [1, test]

        long end = (test / 2)

        def possibleFactor = 2
        while (possibleFactor <= end) {

            if (test % possibleFactor == 0) {
                def otherFactor = test / possibleFactor
                end = otherFactor - 1
                factorPairs << [(long) possibleFactor, (long) otherFactor]
                if (quitOnNotPrime)
                    return factorPairs
            }
            possibleFactor++
        }

        factorPairs
    }

    static List<List<Long>> factor(long test) {
        factor(test, false)
    }

    static boolean isPrime(long test) {
        factor(test, true).size() == 1
    }

    // Sieve of Eratosthenes
    static Set<Long> findPrimes(long max) {
        if (max <= 1)
            throw new IllegalArgumentException('unable to find primes for numbers not greater than 1')

        def composites = findComposites(max)
        def range = (2..max) as Set
        range.removeAll(composites)
        range as Set
    }

    // find all composite (non-primes) up to a given value
    static Set<Long> findComposites(Long max) {
        if (max < 2)
            throw new IllegalArgumentException('unable to calculate composites for negative numbers')

        def composites = [] as Set
        if (max < 4)
            return composites

        def midway = max / 2
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

        composites
    }

}
