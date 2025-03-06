package com.felipe.arka.warehouse.mappers.implementation;

import com.felipe.arka.warehouse.dtos.ProductDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.ProductResponseDTO;
import com.felipe.arka.warehouse.entities.Product;
import com.felipe.arka.warehouse.mappers.ProductMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapperImpl implements ProductMapper {
  @Override
  public Product productDTOToProduct(ProductDTO productDTO) {
    return null;
  }

  @Override
  public ProductResponseDTO productToProductResponseDTO(Product product) {
    return null;
  }

  @Override
  public List<ProductResponseDTO> productsToProductResponseDTOs(List<Product> products) {
    return List.of();
  }
}
