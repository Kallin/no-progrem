public class Util {

    // try dividing by 2, then 3, then 4, then 5... up to test/2
    // if you find a factor, then test/factor is also a factor.
    // you can then change the end point to test/factor
    // returns a list of factor-pairs
    public static List<List<Long>> factor(long test) {
        List<List<Long>> factorPairs = []
        factorPairs << [1, test]

        long end = (test / 2)

        def possibleFactor = 2
        while (possibleFactor < end) {
            if (test % possibleFactor == 0) {
                final newEnd = test / possibleFactor
                end = newEnd
                factorPairs << [(long) possibleFactor, (long) newEnd]
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

    // simpler, reusing factor method, but takes longer than isPrime1
    public static boolean isPrime2(long test) {
        return factor(test).size()==1
    }

    //todo: try using factor method for prime, quitting as soon as first non-trivial pair found
}
