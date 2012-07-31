abstract class Problem {

    final static SOLUTION_RUN_COUNT = 100

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

    abstract getAnswer();

    public static void main(String[] args) {

        def totalDuration = 0
        def problem1 = new Problem1()

        SOLUTION_RUN_COUNT.times {
            totalDuration += timeCode {
                problem1.solution1()
            }
        }
        def avgTime = totalDuration/ SOLUTION_RUN_COUNT
        println "average time for problem1: $avgTime ms"


    }
}
