package com.noproglem
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 extends Problem {

    def solution1() {
        List<List<Long>> factorPairs = Util.factor(given.target, false).sort().reverse()
        return factorPairs.flatten().findAll {Util.isPrime(it)}.sort().reverse()[0]
    }

}




