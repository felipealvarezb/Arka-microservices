package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.dtos.OrderDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;
import com.felipe.arka.checkout.repositories.OrderRepository;
import com.felipe.arka.checkout.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;

  @Override
  public List<OrderResponseDTO> findOrdersByProductId(Long productId) {
    return List.of();
  }

  @Override
  public List<OrderResponseDTO> findOrdersByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
    return List.of();
  }

  @Override
  public List<OrderResponseDTO> findOrdersByUserId(Long userId) {
    return List.of();
  }

  @Override
  public OrderResponseDTO createOrder(Long userId) {
    return null;
  }

  @Override
  public OrderResponseDTO updateOrder(Long orderId, OrderDTO orderDTO) {
    return null;
  }

  @Override
  public String deleteOrder(Long orderId) {
    return "";
  }
}
