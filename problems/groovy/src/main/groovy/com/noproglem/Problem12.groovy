package com.noproglem

class Problem12 extends Problem {

    def solution1() {
        def divisors = given.divisors

        def triangleNumber = 1
        def triangleNumberCount = 1

        while (true) {
            def divisorCount = (Util.factor(triangleNumber).size()) * 2
            if (divisorCount > divisors) {
                return triangleNumber
            }

            triangleNumberCount++
            triangleNumber += triangleNumberCount
        }

    }


}
