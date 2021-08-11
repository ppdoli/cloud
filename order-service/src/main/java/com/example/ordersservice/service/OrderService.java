package com.example.ordersservice.service;

import com.example.ordersservice.dto.OrderDto;
import com.example.ordersservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}