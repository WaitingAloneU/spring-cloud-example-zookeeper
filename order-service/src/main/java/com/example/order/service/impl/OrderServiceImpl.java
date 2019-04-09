package com.example.order.service.impl;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class OrderServiceImpl implements OrderService {

    @Value("${id}")
    private Long id;

    @Value("${userId}")
    private Long userId;

    @Value("${foo}")
    private String remark;

    @Override
    public Order getInfo(){
        Order order = new Order();
        order.setId(id);
        order.setUserId(userId);
        order.setRemark(remark);
        return order;
    }
}
