package org.test.pages

import geb.Page
import org.test.commons.Configuration

class AmazonHomePage extends Page {

    static url = Configuration.instance.config.pages.amazon.urls.amazonHomePage

    static at = { waitFor(25) { $("span[class='nav-sprite nav-logo-base']").displayed } }

    static content = {
        searchField { $("input[id='twotabsearchtextbox']") }
        searchBtn { $("span[id='nav-search-submit-text']") }
        booksBtn { $("li[id='n/266239']").children() }
        firstItemName { $("div[data-cel-widget='search_result_1']").$("span[class='a-size-medium a-color-base a-text-normal']").text() }
        itemBadge { $("span[class='a-badge-label-inner a-text-ellipsis']").first() }
        itemType { $("div[data-cel-widget='search_result_1']").$("a", text: "Paperback") }
        itemPriceInList { $("div[data-cel-widget='search_result_1']").$("span[class='a-price-whole']").last() }
        itemName { $("span[id='productTitle']").text() }
        acceptCookiesBtr { $("input[id='sp-cc-accept']") }
        itemPrice { $("span[class='a-size-base a-color-price a-color-price']") }
        addToCartBtn { $("input[id='add-to-cart-button']") }
        notificationAddedtoBasket { $("div[id='huc-v2-order-row-confirm-text']").children().text() }
        numberOfItemsInBasket { $("span[class='a-size-medium a-align-center huc-subtotal']").firstElement().text }
        editBasketBtn { $("a[id='hlb-view-cart-announce']") }
        itemNameinBasket { $("span[class='a-size-medium sc-product-title a-text-bold']").text() }
        itemTypeinBasket { $("span[class='a-size-small a-color-secondary sc-product-binding']").text() }
        itemPriceInBasket { $("span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']").text() }
        itemQtyInBasket { $("span[class='a-dropdown-prompt']").text() }


    }

//    static content = {
//        searchField{ $("input[id='twotabsearchtextbox']")}
//        searchBtn{ $("span[id='nav-search-submit-text']") }
//        seeAllBtn {$("span",text:"See All 30 Departments").lastElement() }
//        cloathingShoesJeweleryBtn {$("span",text:"Clothing, Shoes & Jewelry").lastElement() }
//        minValueField {$("input[id='low-price']") }
//        maxValueField {$("input[id='high-price']")}
//        goValueBtn {$("span[class='a-button a-spacing-top-mini a-button-base s-small-margin-left']")}
//        selectFirstItem{ $("div[class='s-expand-height s-include-content-margin s-border-bottom s-latency-cf-section']").firstElement() }
//        selectQuantityDropdown{ $("span[class='a-dropdown-label']")}
//        selectItemFromDropdownItem{$("a[id='quantity_3']")}
//        addToCartBtn{ $("input[id='add-to-cart-button']")}
//        goToCartBtn{ $("a[id='hlb-view-cart-announce']").parent() }
//        itemName{ $("span[id='productTitle']").text() }
//        itemPrice{ $("span[id='priceblock_ourprice']").text() }
//        subtotalPrice{ $("span[id='sc-subtotal-amount-buybox']").children().text() }
//        itemNameInCart{ $("span[class='a-size-medium sc-product-title a-text-bold']").text() }
//        itemPriceInCart{ $("span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']").text() }
//        itemCountinCart{ $("span[id='sc-subtotal-label-activecart']").text() }
//        itemSubtotalPrice{ $("span[id='sc-subtotal-amount-buybox']").text() }
//
//    }
}

