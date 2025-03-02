package com.felipe.arka.customer.mappers.implementation;


import com.felipe.arka.customer.dtos.UserDTO;
import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.entities.Rol;
import com.felipe.arka.customer.entities.User;
import com.felipe.arka.customer.entities.UserRol;
import com.felipe.arka.customer.mappers.UserMapper;
import com.felipe.arka.customer.repository.RolRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapperImpl implements UserMapper {

  @Autowired
  private RolRepository rolRepository;

  @Override
  public User userDtoToUser(UserDTO userDTO) {
    User user = new User();
    user.setName(userDTO.getName());
    user.setEmail(userDTO.getEmail());
    user.setPassword(userDTO.getPassword());
    user.setPhone(userDTO.getPhone());
    user.setActive(userDTO.isActive());
    List<UserRol> userRoles = userDTO.getRolesId().stream()
            .map(roleId -> {
              Rol rol = rolRepository.findById(roleId)
                      .orElseThrow(() -> new EntityNotFoundException("Rol no encontrado"));
              return new UserRol(null, user, rol, new Date(), new Date());
            }).collect(Collectors.toList());
    user.setUserRoles(userRoles);
    return user;
  }

  @Override
  public UserResponseDTO userToUserResponseDTO(User user) {
    UserResponseDTO userResponseDTO = new UserResponseDTO();
    userResponseDTO.setName(user.getName());
    userResponseDTO.setEmail(user.getEmail());
    userResponseDTO.setPhone(user.getPhone());
    userResponseDTO.setActive(user.isActive());
    userResponseDTO.setRolNames(user.getUserRoles().stream().map(UserRol::getRol).map(Rol::getName).collect(Collectors.toList()));
    userResponseDTO.setCreatedAt(user.getCreatedAt());
    userResponseDTO.setUpdatedAt(user.getUpdatedAt());
    return userResponseDTO;
  }

  @Override
  public List<UserResponseDTO> listUserToListUserResponseDTO(List<User> users) {
    return users.stream()
            .map(this::userToUserResponseDTO)
            .collect(Collectors.toList());
  }
}
