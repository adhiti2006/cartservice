package com.gcp.cartservice.controller

import com.gcp.cartservice.domain.Order
import com.gcp.cartservice.service.CartService
import spock.lang.Specification

class CartControllerSpec extends Specification{

    CartController cartController = new CartController(
    )

    void fetchProduct() {
        given:
        CartService cartService = Mock()
        cartController.cartService = cartService

        when:
        Order order = cartController.addItemToOrder('1234')

        then:
            1 * cartService.addItemsToOrder(_) >> new Order()
            assert order
    }
}
