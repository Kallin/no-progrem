package com.noproglem

@SuppressWarnings('DuplicateNumberLiteral')
class Problem14 extends Problem {

    def solution1() {
        def maxChain = 0
        def collatzForMax = 0

        for (long test in 1..given.max) {

            def chainLength = findCollatzLength(test)

            if (chainLength > maxChain) {
                maxChain = chainLength
                collatzForMax = test
            }
        }

        collatzForMax
    }

    def collatzMap = [:]
    def findCollatzLength(long test) {
        if (collatzMap[test])
            return collatzMap[test]

        if (test == 1)
            return 1

        def collatzValue
        if (test % 2 == 0) {
            collatzValue = findCollatzLength((long) test / 2) + 1
        } else {
            collatzValue = findCollatzLength(test * 3 + 1) + 1
        }

        collatzMap[test] = collatzValue

        collatzMap[test]
    }

}


