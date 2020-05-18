package org.test.pages

import geb.Page
import org.test.commons.Configuration


class AbvMainPage extends Page {

    static url = Configuration.instance.config.pages.abv.urls.abvMainPage

    static at = { waitFor(25) { $("div[class='abv-button']").displayed } }

    static content = {
        createEmailBtn { $("div[class='abv-button']") }
        receiverEmailField { String value -> $("input[class='fl']").value(value)[0] }
        themeTextField { String value -> $("input[class='gwt-TextBox']").value(value) }
    }
}
