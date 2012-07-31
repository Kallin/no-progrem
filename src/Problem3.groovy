/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 extends Problem {

    final static TARGET = 600851475143
    final static KNOWN_ANSWER = 6857

    @Override
    def getKnownAnswer() {
        return KNOWN_ANSWER
    }

    def solution1() {
        List<Long> factors = factor(TARGET).sort().reverse()
        return  factors.findAll {isPrime(it)}.sort().reverse()[0]
    }

// try dividing by 2, then 3, then 4, then 5... up to test/2
// if you find a factor, then test/factor is also a factor.
// you can then change the end point to test/factor
    List factor(long test) {
        List<Long> factors = [1, test]

        long end = (test / 2)

        def possibleFactor = 2
        while (possibleFactor < end) {
            if (test % possibleFactor == 0) {
                final newEnd = test / possibleFactor
                end = newEnd
                factors << (long) possibleFactor
                factors << (long) newEnd
            }
            possibleFactor++
        }

        return factors
    }

    // skip evens
    boolean isPrime(long test) {
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

    //2,3,5,7,11,13

}




