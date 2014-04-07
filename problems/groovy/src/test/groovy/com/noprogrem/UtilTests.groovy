package com.noprogrem

import com.noproglem.Util
import org.junit.Test


class UtilTests {

    @Test(expected = RuntimeException)
    void factorZeroShouldShouldFail() {
        Util.factor(0)
    }

    @Test(expected = RuntimeException)
    void factorNegativeShouldFail() {
        Util.factor(-1)
    }

    @Test
    void aVarietyOfFactorsShouldWork() {
        assert Util.factor(1) == [[1, 1]]
        assert Util.factor(2) == [[1, 2]]
        assert Util.factor(4) == [[1, 4], [2, 2]]
        assert Util.factor(20) == [[1, 20], [2, 10], [4, 5]]
    }

    @Test
    void shouldQuitWhenNonPrimeDetected() {
        assert Util.factor(20, true) == [[1, 20], [2, 10]]
    }

    @Test(expected = RuntimeException)
    void primeCheckZeroShouldFail() {
        Util.isPrime(0)
    }

    @Test(expected = RuntimeException)
    void primeCheckNegativeShouldFail() {
        Util.isPrime(-1)
    }

    final static KNOWN_PRIMES_TO_TWENTY = [1, 2, 3, 5, 7, 11, 13, 17, 19]

    @Test
    void aVarietyOfPrimeChecksShouldWork() {
        KNOWN_PRIMES_TO_TWENTY.each {
            assert Util.isPrime(it)
        }
        ((1..20) - KNOWN_PRIMES_TO_TWENTY).each {
            assert !Util.isPrime(it)
        }
    }

    @Test(expected = RuntimeException)
    void compositesToNegativeShouldFail() {
        Util.findComposites(-1)
    }

    @Test
    void aVarietyOfCompositesShouldWork() {
        def knownComposites = [] as Set
        assert Util.findComposites(2) == knownComposites
        assert Util.findComposites(3) == knownComposites
        assert Util.findComposites(4) == (knownComposites << 4)
        assert Util.findComposites(5) == knownComposites
        assert Util.findComposites(6) == (knownComposites << 6)
        assert Util.findComposites(7) == knownComposites
        assert Util.findComposites(8) == (knownComposites << 8)
        assert Util.findComposites(9) == (knownComposites << 9)
        assert Util.findComposites(10) == (knownComposites << 10)
    }

    @Test(expected = RuntimeException)
    void primesToNegativeShouldFail() {
        Util.findPrimes(-1)
    }

    @Test(expected = RuntimeException)
    void primesToZeroShouldFail() {
        Util.findPrimes(0)
    }

    @Test(expected = RuntimeException)
    void primesToOneShouldFail() {
        Util.findPrimes(1)
    }

    @Test
    void aVarietyOfPrimesShouldWork() {
        def knownPrimes = [] as Set
        assert Util.findPrimes(2) == knownPrimes << 2
        assert Util.findPrimes(3) == knownPrimes << 3
        assert Util.findPrimes(4) == knownPrimes
        assert Util.findPrimes(5) == knownPrimes << 5
        assert Util.findPrimes(6) == knownPrimes
        assert Util.findPrimes(7) == knownPrimes << 7
        assert Util.findPrimes(8) == knownPrimes
        assert Util.findPrimes(9) == knownPrimes
        assert Util.findPrimes(10) == knownPrimes
    }


}
