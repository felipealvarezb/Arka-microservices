package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
