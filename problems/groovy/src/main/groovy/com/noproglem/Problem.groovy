package com.noproglem

import groovy.json.JsonSlurper

abstract class Problem {

    def answer
    def given

    Problem() {
        final simpleName = this.class.simpleName.toLowerCase()

        final file = new File("../problems/src/main/resources/${simpleName}.json")
        final slurper = new JsonSlurper()
        def object = slurper.parseText(file.text)
        ['answer', 'given'].each {
            this[it] = object[it]
        }
    }

}
