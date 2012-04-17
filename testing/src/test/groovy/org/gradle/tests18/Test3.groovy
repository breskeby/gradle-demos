package org.gradle.tests18

import spock.lang.Specification

class Test3 extends Specification {
    def mySpec() {
        Thread.sleep(44)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}