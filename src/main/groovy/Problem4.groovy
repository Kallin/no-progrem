/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Problem4 extends Problem {

    final static KNOWN_ANSWER = 906609

    final static MAX_TEST = 999 * 999
    final static MIN_TEST = 111 * 111

    @Override
    def getKnownAnswer() {
        return KNOWN_ANSWER
    }

    // now we just need to scan down palindromes, factor each, and see if any factor pair are both 2 digits
    def solution1() {
        def stringifiedNumber
        def isPalindrome
        def length1
        def length2
        def test = MAX_TEST
        while (test >= MIN_TEST) {
            stringifiedNumber = test.toString()
            isPalindrome = stringifiedNumber.reverse() == stringifiedNumber
            if (isPalindrome) {
                final List<List<Long>> factorPairs = Util.factor(test, false)
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