package com.felipe.arka.customer.controllers;

import com.felipe.arka.customer.dtos.UserDTO;
import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
    List<UserResponseDTO> users = userService.getAllUsers();
    return ResponseEntity.ok().body(users);
  }

  @GetMapping("/{userId}")
  public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long userId) {
    UserResponseDTO userResponseDTO = userService.getUserById(userId);
    return ResponseEntity.ok().body(userResponseDTO);
  }

  @PostMapping
  public ResponseEntity<UserResponseDTO> createUser(@Validated @RequestBody UserDTO userDTO) {
    UserResponseDTO userResponseDTO = userService.createUser(userDTO);
    return ResponseEntity.ok().body(userResponseDTO);
  }

  @PutMapping("/{userId}")
  public ResponseEntity<UserResponseDTO> updateUser(@PathVariable Long userId, @Validated @RequestBody UserDTO userDTO) {
    UserResponseDTO userResponseDTO = userService.updateUser(userId, userDTO);
    return ResponseEntity.ok().body(userResponseDTO);
  }

  @DeleteMapping("/{userId}")
  public ResponseEntity<String> deleteUserById(@PathVariable Long userId) {
    String message = userService.deleteUserById(userId);
    return ResponseEntity.ok().body(message);
  }
}
