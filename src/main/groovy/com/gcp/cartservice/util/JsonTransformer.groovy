package com.gcp.cartservice.util

import com.fasterxml.jackson.databind.ObjectMapper

class JsonTransformer {

    static String asJson(Object request) {
        ObjectMapper objectMapper = new ObjectMapper()
        return objectMapper.writeValueAsString(request)
    }

}
