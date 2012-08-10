public class Util {

    // try dividing by 2, then 3, then 4, then 5... up to test/2
    // if you find a factor, then test/factor is also a factor.
    // you can then change the end point to test/factor
    // returns a list of factor-pairs
    public static List<List<Long>> factor(long test, boolean quitOnNotPrime) {
        List<List<Long>> factorPairs = []
        factorPairs << [1, test]

        long end = (test / 2)

        def possibleFactor = 2
        while (possibleFactor <= end) {

            buildMultiples(end)
            // let's skip if it's a multiple of something we've already done
            // calc multiples up to end

            if (test % possibleFactor == 0) {
                final newEnd = test / possibleFactor
                end = newEnd
                factorPairs << [(long) possibleFactor, (long) newEnd]
                if (quitOnNotPrime)
                    return factorPairs
            }
            possibleFactor++
        }

        return factorPairs
    }

    public static boolean isPrime(long test) {
        def isPrime = true
        def possibleFactor = 2
        while (possibleFactor < test) {
            if (test % possibleFactor == 0) {
                isPrime = false
                break
            }

            //after checking 2, we no longer need to check even numbers
            if (possibleFactor == 2) {
                possibleFactor = 3
            } else {
                possibleFactor += 2
            }
        }
        return isPrime
    }

    /* every time we test a number we can avoid testing all of it's multiples
    maintain a set of all the multiples.
    we don't want to generate it indefinitely
    we want to keep it in memory

    */

    public static List<Long> generatePrimes(Long primeCount) {

    }

    // simpler, reusing factor method, shorter than isPrime1
    public static boolean isPrime2(long test) {
        return factor(test, true).size() == 1
    }

    //todo: have this take a closure
    public static List<Long> sievePrimes(long max) {


        def multiples = buildMultiples(max)

        def primes = []

        def test = 1
        while (test < max) {
            if (!multiples.contains(test)) {
                if (isPrime2(test))
                    primes << test
            } else {
                println test
            }


            test++
        }

        return primes
    }

    // FOR SURE not primes

    static Set<Long> knownMultiples = []
    static Long highestMultiple

    public static getMultiplesTo(Long max) {
        if (!highestMultiple) {
            knownMultiples = buildMultiplesTo(2, max);
        } else if (max > highestMultiple) {
            knownMultiples = buildMultiplesTo(highestMultiple, max);
        }

        highestMultiple = max
        return knownMultiples
    }

    public static Set buildMultiplesTo(Long min, Long max) {

        final midway = max / 2
        for (test in (2..midway)) {

            if (knownMultiples.contains(test))
                continue

            def multiplier = 2
            def multiple
            while ((multiple = test * multiplier) < midway) {
                knownMultiples << multiple
                multiplier++
            }
        }

    }

}
