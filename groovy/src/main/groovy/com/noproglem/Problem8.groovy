package com.noproglem

public class Problem8 extends Problem {

    // todo: optimize by skipping ranges that contain 0
    // todo: when shifting one over, we can divide the first digit of the previous test off and multiply the incoming digit, saving operations if consecutive_digits>2

    final static CONSECUTIVE_DIGITS = 5

    def solution1() {

        int startIndex = -1
        def maxProduct = 0
        def product
        while (startIndex < given.test.length() - 1 - CONSECUTIVE_DIGITS) {
            startIndex++

            product = 1
            for (termIndex in (startIndex + CONSECUTIVE_DIGITS - 1..startIndex)) {
                product *= given.test[termIndex].toInteger()
            }

            if (product > maxProduct)
                maxProduct = product

        }

        return maxProduct
    }
}

