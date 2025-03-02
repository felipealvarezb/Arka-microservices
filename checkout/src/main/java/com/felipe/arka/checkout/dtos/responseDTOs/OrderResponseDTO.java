package com.felipe.arka.checkout.dtos.responseDTOs;

import com.felipe.arka.checkout.dtos.ProductDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

  @NotNull(message = "Order total is required")
  private double total;

  @NotBlank(message = "Order status is required")
  @NotNull
  private String status;

  @NotNull(message = "User id is required")
  private Long userId;

  @NotNull(message = "At least one product are required")
  private List<ProductDTO> productDTO;

}
