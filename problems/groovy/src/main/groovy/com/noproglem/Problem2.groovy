package com.noproglem

@SuppressWarnings('DuplicateNumberLiteral')
class Problem2 extends Problem {

    def solution1() {
        def temp
        def prevTerm = 1
        def currTerm = 2
        def sumOfEvens = 0
        while (currTerm < given.max) {
            if (currTerm % 2 == 0)
                sumOfEvens += currTerm
            temp = currTerm + prevTerm
            prevTerm = currTerm
            currTerm = temp
        }

        sumOfEvens
    }


}
