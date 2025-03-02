package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
