abstract class Problem {

    final static SOLUTION_RUN_COUNT = 10

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

    abstract getKnownAnswer();

    public static void main(String[] args) {
        (1..4).each{
            def totalDuration = 0
            Problem problem = java.lang.Class.forName("Problem$it").newInstance()

            SOLUTION_RUN_COUNT.times {
                totalDuration += timeCode {
                    assert problem.knownAnswer == problem.solution1()
                }
            }

            def avgTime = totalDuration / SOLUTION_RUN_COUNT
            println "average time for problem$it: $avgTime ms"

        }
    }

}
