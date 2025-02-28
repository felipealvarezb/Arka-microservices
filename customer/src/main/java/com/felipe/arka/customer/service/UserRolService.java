package com.felipe.arka.customer.service;

import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;

public interface UserRolService {

  UserResponseDTO assignRol(Long userId, Long rolId);

  UserResponseDTO removeRol(Long userId, Long rolId);
}
