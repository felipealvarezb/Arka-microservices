package com.felipe.arka.customer.service.implementation;

import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.entities.Rol;
import com.felipe.arka.customer.entities.User;
import com.felipe.arka.customer.entities.UserRol;
import com.felipe.arka.customer.mappers.UserMapper;
import com.felipe.arka.customer.repository.RolRepository;
import com.felipe.arka.customer.repository.UserRepository;
import com.felipe.arka.customer.repository.UserRolRepository;
import com.felipe.arka.customer.service.UserRolService;
import com.felipe.arka.customer.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRolServiceImpl implements UserRolService {

  private final UserRolRepository userRolRepository;

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  private final RolRepository rolRepository;

  @Override
  public UserResponseDTO assignRol(Long userId, Long rolId) {
    Rol existingRol = rolRepository.findById(rolId)
            .orElseThrow(() -> new EntityNotFoundException("Rol not found"));

    User existingUser = userRepository.findById(userId)
            .orElseThrow(() -> new EntityNotFoundException("User not found"));

    boolean exists = userRolRepository.existsByUserIdAndRolId(userId, rolId);

    if (exists) {
      throw new IllegalArgumentException("User already has this role");
    }

    UserRol userRol = new UserRol();
    userRol.setUser(existingUser);
    userRol.setRol(existingRol);
    userRolRepository.save(userRol);

    return userMapper.userToUserResponseDTO(existingUser);
  }

  @Override
  public UserResponseDTO removeRol(Long userId, Long rolId) {
    Rol existingRol = rolRepository.findById(rolId)
            .orElseThrow(() -> new EntityNotFoundException("Rol not found"));

    User existingUser = userRepository.findById(userId)
            .orElseThrow(() -> new EntityNotFoundException("User not found"));

    boolean exists = userRolRepository.existsByUserIdAndRolId(userId, rolId);

    if (!exists) {
      throw new IllegalArgumentException("User does not have this role");
    }

    UserRol userRol = userRolRepository.findByUserIdAndRolId(userId, rolId)
            .orElseThrow(() -> new EntityNotFoundException("UserRol not found"));

    userRolRepository.delete(userRol);

    return userMapper.userToUserResponseDTO(existingUser);

  }
}
