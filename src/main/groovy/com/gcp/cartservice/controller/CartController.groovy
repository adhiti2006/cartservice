package com.gcp.cartservice.controller

import com.gcp.cartservice.domain.Order
import com.gcp.cartservice.domain.OrderCreationRequest
import com.gcp.cartservice.service.CartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('api/v1/cart')
class CartController {

    @Autowired
    CartService cartService

    @PostMapping
    Order addItemToOrder(@RequestBody OrderCreationRequest orderCreationRequest) {
        return cartService.addItemsToOrder(orderCreationRequest)
    }

}
