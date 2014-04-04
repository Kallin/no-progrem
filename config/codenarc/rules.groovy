ruleset {

    description 'no-progrem code quality rules'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml')
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        LineLength(enabled: false)
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/groovyism.xml')
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/naming.xml') {
        MethodName {
            doNotApplyToClassNames = '*Test, *Spec'
        }
    }
    ruleset('rulesets/security.xml')
    ruleset('rulesets/size.xml') {
        CrapMetric(enabled: false)
    }
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')

}