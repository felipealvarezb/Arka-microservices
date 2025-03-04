package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.dtos.OrderDTO;
import com.felipe.arka.checkout.dtos.UserDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.OrderResponseDTO;
import com.felipe.arka.checkout.entities.Cart;
import com.felipe.arka.checkout.entities.CartDetail;
import com.felipe.arka.checkout.entities.Order;
import com.felipe.arka.checkout.entities.OrderDetail;
import com.felipe.arka.checkout.feign.UserFeignClient;
import com.felipe.arka.checkout.mappers.OrderMapper;
import com.felipe.arka.checkout.repositories.CartDetailRepository;
import com.felipe.arka.checkout.repositories.CartRepository;
import com.felipe.arka.checkout.repositories.OrderRepository;
import com.felipe.arka.checkout.service.OrderService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;
  private final CartRepository cartRepository;
  private final CartDetailRepository cartDetailRepository;
  private final OrderMapper orderMapper;
  private final UserFeignClient userFeignClient;

  @Override
  public List<OrderResponseDTO> findOrdersByProductId(Long productId) {
    List<Order> orders = orderRepository.findByProductId(productId);
    return orderMapper.ordersToOrderResponseDTOs(orders);
  }

  @Override
  public List<OrderResponseDTO> findOrdersByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
    List<Order> orders = orderRepository.findOrdersInDateRange(startDate, endDate);
    return orderMapper.ordersToOrderResponseDTOs(orders);
  }

  @Override
  public List<OrderResponseDTO> findOrdersByUserId(Long userId) {
    List<Order> orders = orderRepository.findOrdersByUserId(userId);
    return orderMapper.ordersToOrderResponseDTOs(orders);
  }

  @Override
  public OrderResponseDTO createOrder(Long userId) {
    UserDTO existingUser = userFeignClient.getUserById(userId).getBody();

    Cart userCart = cartRepository.findByUserId(userId)
            .orElseThrow(() -> new EntityNotFoundException("Cart not found"));

    validateCart(userCart);

    Order order = new Order();
    order.setUser(existingUser);
    order.setStatus("Pending");
    order.setOrderDetails(new ArrayList<>());

    double totalOrder = calculateTotalOrder(userCart, order);
    order.setTotal(totalOrder);

    orderRepository.save(order);
    clearUserCart(userCart);

    return orderMapper.orderToOrderResponseDTO(order);
  }

  @Override
  public OrderResponseDTO updateOrder(Long orderId, OrderDTO orderDTO) {
    return null;
  }

  @Override
  public String deleteOrder(Long orderId) {
    Order existingOrder = orderRepository.findById(orderId)
            .orElseThrow(() -> new EntityNotFoundException("Order not found"));
    orderRepository.delete(existingOrder);
    return "Order deleted successfully";
  }

  private double calculateTotalOrder(Cart cart, Order order) {
    double totalOrder = 0.0;
    for (CartDetail cartDetail : cart.getCartDetails()) {
      OrderDetail orderDetail = new OrderDetail();
      orderDetail.setProduct(cartDetail.getProduct());
      orderDetail.setOrder(order);
      orderDetail.setQuantity(cartDetail.getQuantity());
      orderDetail.setSubtotal(cartDetail.getProduct().getProductPrice() * cartDetail.getQuantity());
      order.getOrderDetails().add(orderDetail);
      totalOrder += orderDetail.getSubtotal();
    }
    return totalOrder;
  }

  private void validateCart(Cart cart) {
    if (cart.getCartDetails().isEmpty()) {
      throw new IllegalStateException("Cart is empty");
    }
  }

  private void clearUserCart(Cart cart) {
    cartDetailRepository.deleteByCartId(cart.getId());
    cart.setCartDetails(new ArrayList<>());
    cartRepository.save(cart);
  }
}
