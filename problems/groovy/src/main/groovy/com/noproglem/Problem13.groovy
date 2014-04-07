package com.noproglem

class Problem13 extends Problem {

    def solution1() {
        def addends = given.test
        addends.sum().toString().subSequence(0, 10) as long
    }

}
