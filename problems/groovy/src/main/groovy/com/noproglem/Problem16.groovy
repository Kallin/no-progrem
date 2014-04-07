package com.noproglem

class Problem16 extends Problem {

    def solution1() {
        base = new BigDecimal(2)
        pow = base.pow(given.exponent)

        int total = 0
        pow.toString().each {
            total += it.toInteger()
        }

        total
    }

}


