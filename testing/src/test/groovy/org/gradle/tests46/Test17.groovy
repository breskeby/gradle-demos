package org.gradle.tests46

import spock.lang.Specification

class Test17 extends Specification {
    def mySpec() {
        Thread.sleep(7)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}