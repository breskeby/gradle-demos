package org.gradle.tests28

import spock.lang.Specification

class Test6 extends Specification {
    def mySpec() {
        Thread.sleep(62)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}