package org.test.suits

import org.openqa.selenium.interactions.Actions
import org.test.pages.AmazonHomePage
import geb.spock.GebSpec

class WebSuit extends GebSpec {

    final static String HARRY_POTTER = "Harry Potter and the Cursed Child"
    final static String ITEM_NAME = "Harry Potter and the Cursed Child - Parts One and Two"
    final static String NOTIFICATION_TITLE = "Added to Basket"
    final static String ONE_ITEM_IN_BASKET = "1 item"
    final static String TYPE_OF_BOOK = "Paperback"


    def "Amazon task for Fourth "() {
        given: "Go to amazon.com home page"
            to AmazonHomePage
            def itemPrice
        when: "Search for Harry Potter"
            def page = at AmazonHomePage
            page.searchField.value(HARRY_POTTER)
            page.searchBtn.click()
        and: "Add filter for Books"
            page = at AmazonHomePage
            sleep(200)
            page.booksBtn.click()
            page = at AmazonHomePage
        then: "Verify Item Name, If the item badge is displayed, item type and item price"
            sleep(1000)
            assert page.firstItemName.take(53) == ITEM_NAME
            assert page.itemBadge.displayed
            assert page.itemType.text() == TYPE_OF_BOOK
            assert page.itemPriceInList.displayed
        when: "Open item details by pressing on the wanted type"
            itemPrice = page.itemPriceInList.text().replaceAll("[£]", "")
            page.acceptCookiesBtr.click()
            page.itemType.click()
            page = at AmazonHomePage
        then: "Verify item name and item price"
            sleep(1000)
            assert page.itemName.take(53) == ITEM_NAME
            assert page.itemPrice.displayed
        when: "Add item to Cart"
            page.addToCartBtn.click()
            sleep(1000)
            page = at AmazonHomePage
        then: "Verify notification is shown and the item in basket is only one"
            assert page.notificationAddedtoBasket == NOTIFICATION_TITLE
            assert page.numberOfItemsInBasket.contains(ONE_ITEM_IN_BASKET)
        when: "Edit item in basket"
            page.editBasketBtn.click()
            page = at AmazonHomePage
        then: "Verify that everything in basket is as desired"
            assert page.itemNameinBasket.take(53) == ITEM_NAME
            assert page.itemTypeinBasket == TYPE_OF_BOOK
            assert itemPrice == page.itemPriceInBasket.replaceAll("[£]", "").replaceAll("[.00]", "")
            assert page.itemQtyInBasket == "1"
    }
}
