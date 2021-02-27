package com.gcp.cartservice.service

import com.gcp.cartservice.domain.Order
import com.gcp.cartservice.domain.OrderCreationRequest
import com.gcp.cartservice.http.InventoryHttpClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class CartService {

    @Autowired
    InventoryHttpClient inventoryHttpClient

   Order addItemsToOrder(OrderCreationRequest orderCreationRequest) {
       if(orderCreationRequest) {
           ResponseEntity<String> responseEntity = inventoryHttpClient.getInventory(orderCreationRequest?.id, orderCreationRequest?.condition)
           if(responseEntity.body) {
               new Order(id: 'testId')
           }
       }
   }
}
