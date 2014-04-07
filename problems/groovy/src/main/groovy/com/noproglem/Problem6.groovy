package com.noproglem

class Problem6 extends Problem {

    def solution1() {
        def sumOfSquares = 0
        def sum = 0
        (1..100).each {
            sumOfSquares += it * it
            sum += it
        }

        def squareOfSums = sum * sum
        squareOfSums - sumOfSquares
    }

}






