package com.gcp.cartservice.http

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

@Slf4j
@CompileStatic
abstract class BaseHttpClient {

    RestTemplate restTemplate

    BaseHttpClient() {
        restTemplate = createRestTemplate()
    }

    static RestTemplate createRestTemplate() throws Exception{
        return new RestTemplate(new SimpleClientHttpRequestFactory(connectTimeout: 3000, readTimeout: 3000))
    }

    ResponseEntity<String> exchange(String url, HttpMethod httpMethod, String request, HttpHeaders httpHeaders, Object... uriVariables) {
        return  restTemplate.exchange(url, httpMethod, createHttpEntity(request, httpHeaders), String)
    }

    HttpEntity<String> createHttpEntity(String request, HttpHeaders httpHeaders) {
        request ? new HttpEntity<String>(request, httpHeaders) : new HttpEntity<String>(httpHeaders)
    }

}
