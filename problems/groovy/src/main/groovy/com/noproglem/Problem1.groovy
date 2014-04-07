package com.noproglem

class Problem1 extends Problem {

    def solution1() {
        def sum = 0
        (1..given.max).each { test ->
            if (given.divisors.find { divisor -> test % divisor == 0 })
                sum += test
        }

        sum
    }

}
