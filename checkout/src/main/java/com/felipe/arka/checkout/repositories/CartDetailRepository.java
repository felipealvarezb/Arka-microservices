package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
}
