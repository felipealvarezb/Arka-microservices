package com.felipe.arka.customer.service.implementation;

import com.felipe.arka.customer.dtos.UserDTO;
import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.entities.User;
import com.felipe.arka.customer.mappers.UserMapper;
import com.felipe.arka.customer.repository.UserRepository;
import com.felipe.arka.customer.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  private final UserMapper userMapper;

  @Override
  public List<UserResponseDTO> getAllUsers() {
    List<User> users = userRepository.findAll();
    return userMapper.listUserToListUserResponseDTO(users);
  }

  @Override
  public UserResponseDTO getUserById(Long id) {
    User user = userRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("User not found"));
    return userMapper.userToUserResponseDTO(user);
  }

  @Override
  public UserResponseDTO createUser(UserDTO userDTO) {
    User user = userMapper.userDtoToUser(userDTO);
    User savedUser = userRepository.save(user);
    return userMapper.userToUserResponseDTO(savedUser);
  }

  @Override
  public UserResponseDTO updateUser(Long id, UserDTO userDTO) {
    User existingUser = userRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("User not found"));

    existingUser.setName(userDTO.getName());
    existingUser.setEmail(userDTO.getEmail());
    existingUser.setPassword(userDTO.getPassword());
    existingUser.setPhone(userDTO.getPhone());
    existingUser.setActive(userDTO.isActive());

    userRepository.save(existingUser);

    return userMapper.userToUserResponseDTO(existingUser);
  }

  @Override
  public String deleteUserById(Long id) {
    User user = userRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("User not found"));
    userRepository.delete(user);
    return "User deleted successfully";
  }
}
