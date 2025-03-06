package com.felipe.arka.warehouse.dtos;

import com.felipe.arka.warehouse.entities.Country;
import com.felipe.arka.warehouse.entities.Product;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {

  @NotNull(message = "Actual stock cannot be null")
  private int actualStock;

  @NotNull(message = "Minimum stock cannot be null")
  private int minimumStock;

  @NotNull(message = "At least one product is required")
  private List<Long> productIds;

  @NotNull(message = "Country cannot be null")
  private Long countryId;
}
