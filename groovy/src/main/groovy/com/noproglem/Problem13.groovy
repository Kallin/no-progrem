package com.noproglem

class Problem13 extends Problem {

    def solution1() {
        def addends = given.test
        return addends.sum().toString().subSequence(0,10) as long
    }

}
