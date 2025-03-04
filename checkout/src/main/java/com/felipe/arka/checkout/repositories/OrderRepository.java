package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

  @Query("SELECT o FROM Order o WHERE o.createdAt >= :startDate AND o.createdAt < :endDate")
  List<Order> findOrdersInDateRange(LocalDateTime startDate, LocalDateTime endDate);

  @Query("SELECT o FROM Order o WHERE o.product.id = :productId")
  List<Order> findByProductId(Long productId);

  @Query("SELECT o FROM Order o WHERE o.user.id = :userId")
  List<Order> findOrdersByUserId(Long userId);
}
