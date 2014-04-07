package com.noproglem
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
class Problem4 extends Problem {

    // now we just need to scan down palindromes, factor each, and see if any factor pair are both 2 digits
    def solution1() {
        def stringifiedNumber
        def isPalindrome
        def length1
        def length2
        def test = given.max_test
        while (test >= given.min_test) {
            stringifiedNumber = test.toString()
            isPalindrome = stringifiedNumber.reverse() == stringifiedNumber
            if (isPalindrome) {
                List<List<Long>> factorPairs = Util.factor(test, false)
                for (List<Long> factorPair : factorPairs) {
                    length1 = factorPair[0].toString().length()
                    length2 = factorPair[1].toString().length()
                    if ((length1 == length2) && (length1 == 3))
                        return test
                }
            }
            test--
        }
    }

}