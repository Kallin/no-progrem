package com.noproglem

public class Problem10 extends Problem {

    def solution1() {
        def sum = 0
        Util.sievePrimes(1999999).each {
            sum += it
        }
    }

}

