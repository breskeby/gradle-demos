package org.gradle.tests13

import spock.lang.Specification

class Test0 extends Specification {
    def mySpec() {
        Thread.sleep(19)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}