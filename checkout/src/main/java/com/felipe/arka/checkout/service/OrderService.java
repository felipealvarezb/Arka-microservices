package com.felipe.arka.checkout.service;

import com.felipe.arka.checkout.dtos.OrderDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {

  List<OrderResponseDTO> findOrdersByProductId(Long productId);

  List<OrderResponseDTO> findOrdersByDateRange(LocalDateTime startDate, LocalDateTime endDate);

  List<OrderResponseDTO> findOrdersByUserId(Long userId);

  OrderResponseDTO createOrder(Long userId);

  OrderResponseDTO updateOrder(Long orderId, OrderDTO orderDTO);

  String deleteOrder(Long orderId);
}
