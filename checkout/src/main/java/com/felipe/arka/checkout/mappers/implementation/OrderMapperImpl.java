package com.felipe.arka.checkout.mappers.implementation;

import com.felipe.arka.checkout.dtos.OrderDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;
import com.felipe.arka.checkout.entities.Order;
import com.felipe.arka.checkout.mappers.OrderMapper;

import java.util.List;

public class OrderMapperImpl implements OrderMapper {


  @Override
  public Order orderDTOToOrder(OrderDTO orderDTO) {
    return null;
  }

  @Override
  public OrderResponseDTO orderToOrderResponseDTO(Order order) {
    return null;
  }

  @Override
  public List<OrderResponseDTO> ordersToOrderResponseDTOs(List<Order> orders) {
    return List.of();
  }
}
