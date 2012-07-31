/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1 {

    static final

    def solution1() {
        def sum = 0
        (1..1000).each {
            if (it % 3 == 0 || it % 5 == 0)
                sum += it
        }
        println sum
    }

    public static void main(String[] args) {

        100.times {
            def duration = timeCode {
                new Problem1().solution1()
            }
            println duration
        }


    }

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

}
