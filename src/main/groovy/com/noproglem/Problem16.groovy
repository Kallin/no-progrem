package com.noproglem

class Problem16 extends Problem {

    def solution1() {
        final base = new BigDecimal(2)
        final pow = base.pow(given.exponent)

        int total = 0
        pow.toString().each {
            total += it.toInteger()
        }

        return total
    }

}


