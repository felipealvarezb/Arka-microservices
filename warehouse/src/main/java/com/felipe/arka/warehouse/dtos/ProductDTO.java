package com.felipe.arka.warehouse.dtos;

import com.felipe.arka.warehouse.entities.ProductCategory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

  @NotBlank(message = "Name cannot be empty")
  @NotNull(message = "Name cannot be null")
  private String name;

  @NotBlank(message = "Description cannot be empty")
  @NotNull(message = "Description cannot be null")
  private String description;

  @NotBlank(message = "Brand cannot be empty")
  @NotNull(message = "Brand cannot be null")
  private String brand;

  @NotBlank(message = "Attributes cannot be empty")
  @NotNull(message = "Attributes cannot be null")
  private String attributes;

  @NotNull(message = "Price cannot be null")
  private double productPrice;

  @NotNull(message = "Active cannot be null")
  private boolean active;

  @NotNull(message = "Stock is required")
  private Long stockId;

  @NotNull(message = "At least one category is required")
  private List<Long> categoryIds;
}
