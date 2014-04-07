package com.noproglem

class Problem7 extends Problem {

    def solution1() {
        def primeCount = 0

        def test = 2
        while (true) {

            //todo: really need to use a prime generator here
            // we've got a prime generator, but it needs to be able to go indefinitely...
            // needs to know when to stop.. could be a desired number of primes
            if (Util.isPrime(test)) {
                primeCount++
            }
            if (primeCount == 10001)
                return test

            test++
        }
    }
}



