package com.felipe.arka.checkout.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

  private Long id;
  private String name;
  private String description;
  private String brand;
  private String attributes;
  private double productPrice;
  private boolean active;
  private List<String> categoryNames;
}
