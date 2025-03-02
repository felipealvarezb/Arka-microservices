package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl {

  private final PaymentRepository paymentRepository;
}
