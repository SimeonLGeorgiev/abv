package org.test.commons

import groovy.transform.Memoized

@Singleton
class Configuration extends ConfigSlurper  {

   static final String environment = "test-environment.config"
    static final def configFile = './src/main/resources/test-environment.config'

    def config = new ConfigSlurper().parse(new File(configFile as String).toURL())
    public final Map conf = config.flatten();




}




