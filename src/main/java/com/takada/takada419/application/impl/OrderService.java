package com.takada.takada419.application.impl;

import com.takada.takada419.application.dto.CreateOrderRequest;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import com.takada.takada419.application.dto.UpdateOrderStatusRequest; // пример


public interface OrderService {
    SpringDataJaxb.OrderDto createOrder(CreateOrderRequest request);
    SpringDataJaxb.OrderDto getOrderById(Long id);

    SpringDataJaxb.OrderDto updateOrderStatus(UpdateOrderStatusRequest request);
}