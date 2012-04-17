package org.gradle.tests35

import spock.lang.Specification

class Test2 extends Specification {
    def mySpec() {
        Thread.sleep(58)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}