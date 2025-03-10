package com.felipe.arka.customer.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {

  @NotBlank(message = "Rol name is required")
  @NotNull
  private String name;

  @NotBlank(message = "Rol description is required")
  @NotNull
  private String description;
}
