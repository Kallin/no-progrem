package com.noproglem

import groovy.util.logging.Slf4j

@Slf4j
class SolutionExecutor {

    final static DEFAULT_RUN_COUNT = 1

    static long timeCode(Closure timedCode) {
        def before = System.currentTimeMillis()
        timedCode.call()
        def after = System.currentTimeMillis()
        after - before
    }

    static void main(String[] args) {
        def runCount = args ? args[0].toInteger() : DEFAULT_RUN_COUNT

        def skippedProblems = (0..0)
        def problems = (1..16).toList()
        problems.removeAll(skippedProblems)
        problems.each {
            def totalDuration = 0

            def runTimes = []

            Problem problem = this.classLoader.loadClass("com.noproglem.Problem$it").newInstance() as Problem

            runCount.times {
                def executionTime = timeCode {
                    assert problem.answer == problem.solution1()
                }
                runTimes << executionTime
                totalDuration += executionTime
            }

            def avgTime = totalDuration / runCount

            log.info "average time for problem$it: $avgTime ms"
            log.info "execution times: $runTimes"
        }
    }

}
