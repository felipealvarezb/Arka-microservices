package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
