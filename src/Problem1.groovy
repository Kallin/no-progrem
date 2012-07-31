/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
// answer: 234168

public class Problem1 extends Problem {

    static final DIVISORS = [3, 5]
    static final MAX = 999;
    static final ANSWER = 233168

    @Override
    def getKnownAnswer() {
        return ANSWER;
    }

    def solution1() {
        def sum = 0
        (1..MAX).each { test ->
            if (DIVISORS.find { divisor -> test % divisor == 0})
                sum += test
        }
        return sum
    }

}
