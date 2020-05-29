package org.test.suits

import org.test.pages.AbvHomePage
import org.test.pages.AbvSuccessMessagePage
import org.test.users.WebUser
import geb.spock.GebSpec
import org.test.users.roles.WebRoles
import org.test.pages.AbvMainPage

class WebSuit extends GebSpec {

    final static String RECEIVER_EMAIL = "simonar@abv.bg"
    final static String ADDITIONAL_EMAIL = "email"  //please insert your email if you want to receive a copy from this test
    final static String THEME_OF_EMAIL = "Congratulation, someone has used your automation test"

    def "Verify ADMIN can send email (JIRA-1)"() {
        given: "Fetch user ADMIN from configuration"
            WebUser admin = new WebUser(WebRoles.ADMIN)
        when: "Go to abv.bg home page"
            to AbvHomePage
        and: "Log in with ADMIN credentials"
            admin.login()
        then:"Verify login is successful by loading abv main page"
            waitFor { at AbvMainPage}
        and:"Admin can go,create and send email"
            admin.createAndSendEmail(RECEIVER_EMAIL,ADDITIONAL_EMAIL,THEME_OF_EMAIL)
        then:"Verify success page appear on the screen"
            at AbvSuccessMessagePage
    }
}
