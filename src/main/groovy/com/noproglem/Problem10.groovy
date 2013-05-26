package com.noproglem
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.

 */

def sum = 0
Util.sievePrimes(1999999).each {
    sum += it
}