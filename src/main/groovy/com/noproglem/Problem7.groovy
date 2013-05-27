package com.noproglem

public class Problem7 extends Problem {

    def solution1() {
        def primeCount = 0

        def test = 2
        while (true) {

            //todo: really need to use a prime generator here
            // needs to know when to stop.. could be a desired number of primes
            if (Util.isPrime2(test)) {
                primeCount++
            }
            if (primeCount == 10001)
                return test

            test++
        }
    }
}



