package org.test.pages

import geb.Page
import org.test.commons.Configuration


class AbvMainPage extends Page {

    static url = Configuration.instance.config.pages.abv.urls.abvMainPage

    static at = { waitFor(25) { $("div[class='abv-button']").displayed } }

    static content = {
        createEmailBtn { $("div[class='abv-button']") }
        receiverEmailField { $("input[class='fl']") }
        themeTextField { String value -> $("input[class='gwt-TextBox']").value(value) }
        sendMailBtn {$( "div[class='abv-button']")}
    }

     void addReceivers(String receiver1, String receiver2) {
       if(receiver2 != "email")
           receiverEmailField.value(receiver1 + "," + receiver2)
         else
           receiverEmailField.value(receiver1)
    }
}

class AbvSuccessMessagePage extends Page {

    static url = Configuration.instance.config.pages.abv.urls.abvSuccessMsgPage

    static at = { waitFor(25){$("div[id='middlePagePanel']")}}
}