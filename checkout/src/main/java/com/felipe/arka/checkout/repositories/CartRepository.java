package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

  @Query("SELECT c FROM Cart c WHERE c.user.id = :userId")
  Optional<Cart> findByUserId(Long userId);
}
