/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 extends Problem {

    final static KNOWN_ANSWER = 232792560

    // if something is divisible by all numbers in the range 11..20, it must also be divisible by those in the range 2..20
    final static DESIRED_FACTORS = (11..20)
    final static TEST_START = 2520

    @Override
    def getKnownAnswer() {
        return KNOWN_ANSWER
    }

    def solution1() {
        def test = TEST_START
        def containsAll
        while (true) {
            containsAll = true
            for (int desiredFactor : DESIRED_FACTORS) {
                if (test % desiredFactor != 0) {
                    containsAll = false
                    break
                }
            }

            if (containsAll)
                return test

            test += 20
        }
    }
}




