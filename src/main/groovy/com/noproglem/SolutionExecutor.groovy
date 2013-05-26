package com.noproglem

class SolutionExecutor {

    //todo: run count should be confiurable via build
    final static SOLUTION_RUN_COUNT = 1

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

    public static void main(String[] args) {
        def skippedProblems = (7)
        final problems = (1..9).toList()
        problems.removeAll(skippedProblems)
        problems.each {
            def totalDuration = 0

            def runTimes = []

            Problem problem = java.lang.Class.forName("com.noproglem.Problem$it").newInstance()

            SOLUTION_RUN_COUNT.times {
                final executionTime = timeCode {
                    assert problem.answer == problem.solution1()
                }
                runTimes << executionTime
                totalDuration += executionTime
            }

            def avgTime = totalDuration / SOLUTION_RUN_COUNT
            println "average time for problem$it: $avgTime ms"
            println "execution times: $runTimes"
        }
    }

}
