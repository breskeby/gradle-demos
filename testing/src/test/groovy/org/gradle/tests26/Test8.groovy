package org.gradle.tests26

import spock.lang.Specification

class Test8 extends Specification {
    def mySpec() {
        Thread.sleep(4)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}