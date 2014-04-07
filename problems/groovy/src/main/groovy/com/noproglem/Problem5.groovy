package com.noproglem

@SuppressWarnings('DuplicateNumberLiteral')
class Problem5 extends Problem {

    // if something is divisible by all numbers in the range 11..20, it must also be divisible by those in the range 2..20
    final static TEST_START = 20
    final static DESIRED_FACTORS = (11..TEST_START)

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




