package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.CartDetail;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {

  @Transactional
  @Modifying
  @Query(value = "DELETE FROM CartDetail cd WHERE cd.cart.id = :cartId")
  void deleteByCartId(Long cartId);

}
