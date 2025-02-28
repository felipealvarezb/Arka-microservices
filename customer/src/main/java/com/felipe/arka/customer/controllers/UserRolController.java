package com.felipe.arka.customer.controllers;

import com.felipe.arka.customer.dtos.responseDTOs.UserResponseDTO;
import com.felipe.arka.customer.service.UserRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRolController {

  private final UserRolService userRolService;

  @PostMapping("/{userId}/rol/{rolId}")
  public ResponseEntity<UserResponseDTO> assignRol(@PathVariable Long userId, @PathVariable Long rolId) {
    UserResponseDTO userResponseDTO = userRolService.assignRol(userId, rolId);
    return ResponseEntity.ok().body(userResponseDTO);
  }

  @DeleteMapping("/{userId}/rol/{rolId}")
  public ResponseEntity<UserResponseDTO> removeRol(@PathVariable Long userId, @PathVariable Long rolId) {
    UserResponseDTO userResponseDTO = userRolService.removeRol(userId, rolId);
    return ResponseEntity.ok().body(userResponseDTO);
  }
}
