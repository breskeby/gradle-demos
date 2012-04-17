package org.gradle.tests39

import spock.lang.Specification

class Test1 extends Specification {
    def mySpec() {
        Thread.sleep(68)
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}