package org.test.suits

import org.test.pages.AbvHomePage
import org.test.pages.AbvMainPage
import org.test.users.WebUser
import geb.spock.GebSpec
import org.test.users.roles.WebRoles

class WebSuit extends GebSpec {

    def "Verify log in abv.bg with username and password JIRA-1"() {
        given:"Fetch user ADMIN from configuration"
            WebUser admin = new WebUser(WebRoles.ADMIN)
        when:"Go to abv.bg home page"
            def page = to AbvHomePage
        and:"Log in with ADMIN credentials"
            waitFor {page.usernameInputField(admin.role.username)}
            waitFor {page.passwordInputField(admin.role.password)}
            page.loginBtn.click()
        then:"Verify login is successful by loading abv main page"
            waitFor {at AbvMainPage}
    }
}
