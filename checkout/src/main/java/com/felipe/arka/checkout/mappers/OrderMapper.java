package com.felipe.arka.checkout.mappers;

import com.felipe.arka.checkout.dtos.OrderDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;
import com.felipe.arka.checkout.entities.Order;

import java.util.List;

public interface OrderMapper {

  Order orderDTOToOrder(OrderDTO orderDTO);

  OrderResponseDTO orderToOrderResponseDTO(Order order);

  List<OrderResponseDTO> ordersToOrderResponseDTOs(List<Order> orders);
}
