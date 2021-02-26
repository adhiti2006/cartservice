package com.gcp.cartservice.service

import com.gcp.cartservice.domain.Order
import org.springframework.stereotype.Service

@Service
class CartService {

   Order addItemsToOrder(String skuId) {
       return new Order()
   }
}
