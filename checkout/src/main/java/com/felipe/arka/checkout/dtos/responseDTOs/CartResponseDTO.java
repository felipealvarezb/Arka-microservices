package com.felipe.arka.checkout.dtos.responseDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponseDTO {

  @NotBlank(message = "Cart status is required")
  @NotNull(message = "Cart status cannot be null")
  private String status;

  @NotNull(message = "User ID cannot be null")
  private Long userId;

}
