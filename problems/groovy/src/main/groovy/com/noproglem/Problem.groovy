package com.noproglem

import groovy.json.JsonSlurper

class Problem {

    def answer
    def given

    Problem() {
        def simpleName = this.class.simpleName.toLowerCase()

        def file = new File("problems/src/main/resources/${simpleName}.json")
        def slurper = new JsonSlurper()
        def object = slurper.parseText(file.text)
        ['answer', 'given'].each {
            this[it] = object[it]
        }
    }

}
