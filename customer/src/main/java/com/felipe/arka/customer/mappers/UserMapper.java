package com.felipe.arka.customer.mappers;


import com.felipe.arka.customer.dtos.UserDTO;
import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.entities.User;

import java.util.List;

public interface UserMapper {

  User userDtoToUser(UserDTO userDTO);

  UserResponseDTO userToUserResponseDTO(User user);

  List<UserResponseDTO> listUserToListUserResponseDTO(List<User> users);
}
