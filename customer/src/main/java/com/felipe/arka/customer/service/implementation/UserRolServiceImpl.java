package com.felipe.arka.customer.service.implementation;

import com.felipe.arka.customer.repository.UserRolRepository;
import com.felipe.arka.customer.service.UserRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRolServiceImpl implements UserRolService {

  private final UserRolRepository userRolRepository;
}
