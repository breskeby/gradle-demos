package org.gradle.tests4

import spock.lang.Specification

class Test3 extends Specification {
    def mySpec() {
        Thread.sleep(65)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}