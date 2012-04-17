package org.gradle.tests11

import spock.lang.Specification

class Test5 extends Specification {
    def mySpec() {
        Thread.sleep(80)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}