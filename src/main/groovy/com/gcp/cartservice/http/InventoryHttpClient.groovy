package com.gcp.cartservice.http

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClientException

@Slf4j
@CompileStatic
@Service
class InventoryHttpClient extends BaseHttpClient{
    private static final String INVENTORY_URL = 'http://localhost:8081/api/v1/inventory/'

    ResponseEntity<String> getInventory(String id, String condition) throws RestClientException{
        return exchange(condition ? (INVENTORY_URL+id+'/'+condition) : (INVENTORY_URL+id), HttpMethod.GET, null,createHeaders(), createHeaders())
    }

    HttpHeaders createHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders()
        httpHeaders.add('CLIENT_ID', 'CART')
        httpHeaders
    }


}
