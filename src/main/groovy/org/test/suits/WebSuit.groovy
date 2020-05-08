package org.test.suits

import org.test.users.WebAdmin
import spock.lang.Specification
import geb.spock.GebSpec

class WebSuit extends GebSpec {

    def "test"() {
        given:
        WebAdmin WebAdmin = new WebAdmin()
        WebAdmin.login()
        println 'finish'
    }
}
