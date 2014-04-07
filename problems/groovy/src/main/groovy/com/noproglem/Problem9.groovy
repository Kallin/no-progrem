package com.noproglem

class Problem9 extends Problem {

    def solution1() {
        def a = 1
        def b = 2
        def c = 997
        def isTriplet
        while (true) {
            isTriplet = (a * a + b * b) == c * c
            if (isTriplet) {
                return a * b * c
            }

            b++
            c--
            if (b > c) {
                a++
                b = a + 1
                c = 1000 - b - a
            }
        }
    }
}

