package com.felipe.arka.checkout.controllers;

import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;
import com.felipe.arka.checkout.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/product/{productId}")
  public ResponseEntity<List<OrderResponseDTO>> getOrderByProductId(@PathVariable Long productId) {
    List<OrderResponseDTO> orders = orderService.findOrdersByProductId(productId);
    return ResponseEntity.ok().body(orders);
  }

  @GetMapping("/range-date")
  public ResponseEntity<List<OrderResponseDTO>> getOrderByDateRange(
          @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
          @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

    LocalDateTime startDateTime = startDate.atStartOfDay();
    LocalDateTime endDateTime = endDate.atTime(23, 59, 59);

    List<OrderResponseDTO> orders = orderService.findOrdersByDateRange(startDateTime, endDateTime);
    return ResponseEntity.ok().body(orders);
  }

  @GetMapping("/user/{userId}")
  public ResponseEntity<List<OrderResponseDTO>> getOrderByUserId(@PathVariable Long userId) {
    List<OrderResponseDTO> orders = orderService.findOrdersByUserId(userId);
    return ResponseEntity.ok().body(orders);
  }

  @PostMapping("/create/{userId}")
  public ResponseEntity<OrderResponseDTO> create(@PathVariable Long userId) {
    OrderResponseDTO order = orderService.createOrder(userId);
    return ResponseEntity.ok().body(order);
  }

  @DeleteMapping("/{orderId}")
  public ResponseEntity<String> delete(@PathVariable Long orderId) {
    String message = orderService.deleteOrder(orderId);
    return ResponseEntity.ok().body(message);
  }
}
