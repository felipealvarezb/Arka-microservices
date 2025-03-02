package com.felipe.arka.customer.service;

import com.felipe.arka.customer.dtos.UserDTO;
import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;

import java.util.List;

public interface UserService {

  List<UserResponseDTO> getAllUsers();

  UserResponseDTO getUserById(Long id);

  UserResponseDTO createUser(UserDTO userDTO);

  UserResponseDTO updateUser(Long id, UserDTO userDTO);

  String deleteUserById(Long id);
}
