package com.noproglem
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
 */
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



