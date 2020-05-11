package org.test.pages

import geb.Page
import org.test.commons.Configuration

class AbvHomePage extends Page{

    static url = Configuration.instance.config.pages.abv.abvBase

    static at = { waitFor(15) { $("input[id='username']").displayed } }

    static content = {
        usernameInputField { String value ->  $("input[id='username']").click().value(value)  }
        passwordInputField { String value ->  $("input[id='password']").click().value(value)  }
        loginBtn{$("input[id='loginBut']")}
    }

}
