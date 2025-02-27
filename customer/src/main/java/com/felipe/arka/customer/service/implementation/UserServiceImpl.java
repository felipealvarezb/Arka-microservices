package com.felipe.arka.customer.service.implementation;

import com.felipe.arka.customer.repository.UserRepository;
import com.felipe.arka.customer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
}
