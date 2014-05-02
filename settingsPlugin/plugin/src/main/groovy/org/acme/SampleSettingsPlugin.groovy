package org.acme

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

/**
 * Created by Rene on 02/05/14.
 */
class SampleSettingsPlugin implements Plugin<Settings>{

    @Override
    void apply(Settings settings) {
        println "Settings plugin applied"
    }
}
