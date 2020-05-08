package org.test.commons

import groovy.transform.Memoized

@Singleton
class Configuration  {

    static final String DEFAULT_CONFIG_FILE_NAME = "test-environment.config"

    ConfigSlurper configSlurper = new ConfigSlurper()
    // to pass a non-default config file please specify -DconfigFile='<config file name>'
    static final String CONFIG_JVM_PROP_NAME = 'configFile'


    }




