package com.example.order.controller;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("orders")
public class HomeController {

    @Resource
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public Order info(@PathVariable Long orderId){
        log.info("orders/ping接口访问");
        return orderService.getInfo();
    }

    @GetMapping("/ex/{orderId}")
    public Order infoEx(@PathVariable Long orderId){
        log.info("orders/ping接口访问");
        return orderService.getInfo();
    }
}
