package com.felipe.arka.warehouse.dtos.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockResponseDTO {

  private Long id;
  private int actualStock;
  private int minimumStock;
  private List<String> productNames;
  private String countryName;
}
