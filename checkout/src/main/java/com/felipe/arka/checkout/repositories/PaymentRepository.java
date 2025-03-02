package com.felipe.arka.checkout.repositories;

import com.felipe.arka.checkout.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
