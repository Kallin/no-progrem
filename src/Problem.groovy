abstract class Problem {

    final static SOLUTION_RUN_COUNT = 1

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

    abstract getKnownAnswer();

    public static void main(String[] args) {

        runProblem1()
        runProblem2()


    }

    public static void runProblem1() {
        def totalDuration = 0
        def problem1 = new Problem1()

        SOLUTION_RUN_COUNT.times {
            totalDuration += timeCode {
                assert problem1.knownAnswer == problem1.solution1()
            }
        }
        def avgTime = totalDuration / SOLUTION_RUN_COUNT
        println "average time for problem1: $avgTime ms"
    }

    public static void runProblem2() {
        def totalDuration = 0
        def problem2 = new Problem2()

        SOLUTION_RUN_COUNT.times {
            totalDuration += timeCode {
                assert problem2.knownAnswer == problem2.solution1()
            }
        }
        def avgTime = totalDuration / SOLUTION_RUN_COUNT
        println "average time for problem2: $avgTime ms"
    }
}
