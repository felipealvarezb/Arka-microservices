package com.felipe.arka.customer.service.implementation;

import com.felipe.arka.customer.repository.RolRepository;
import com.felipe.arka.customer.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

  private final RolRepository rolRepository;
}
