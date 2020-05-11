package org.test.pages

import geb.Page
import org.test.commons.Configuration

class AbvMainPage extends Page{

    static url = Configuration.instance.config.pages.abv.urls.abvMainPage

    static at = { waitFor(15) { $("div[id='middlePagePanel']").displayed } }

}
