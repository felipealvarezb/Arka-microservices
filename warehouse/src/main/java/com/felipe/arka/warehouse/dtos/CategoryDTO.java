package com.felipe.arka.warehouse.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

  @NotBlank(message = "Name cannot be empty")
  @NotNull(message = "Name cannot be null")
  private String name;

  @NotBlank(message = "Description cannot be empty")
  @NotNull(message = "Description cannot be null")
  private String description;
}
