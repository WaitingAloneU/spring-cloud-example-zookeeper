package com.example.gateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("order-service")
public interface OrderService {

    @RequestMapping(value = "/tokens/create", method = RequestMethod.GET)
    String getToken(@RequestParam("userId") Long userId);

    @RequestMapping(value = "/tokens/auth", method = RequestMethod.GET)
    Boolean authToken(@RequestParam("token") String token);
}
