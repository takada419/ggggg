package com.takada.takada419.controller;

import com.takada.takada419.application.dto.CreateOrderRequest;
import com.takada.takada419.application.dto.UpdateOrderStatusRequest;
import com.takada.takada419.application.impl.OrderService;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<SpringDataJaxb.OrderDto> createOrder(@RequestBody CreateOrderRequest request) {
        return ResponseEntity.ok(orderService.createOrder(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpringDataJaxb.OrderDto> getOrder(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PutMapping("/status")
    public ResponseEntity<SpringDataJaxb.OrderDto> updateOrderStatus(@RequestBody UpdateOrderStatusRequest request) {
        return ResponseEntity.ok(orderService.updateOrderStatus(request));
    }
}
