package com.felipe.arka.warehouse.mappers;

import com.felipe.arka.warehouse.dtos.ProductDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.ProductResponseDTO;
import com.felipe.arka.warehouse.entities.Product;

import java.util.List;

public interface ProductMapper {

  Product productDTOToProduct(ProductDTO productDTO);

  ProductResponseDTO productToProductResponseDTO(Product product);

  List<ProductResponseDTO> productsToProductResponseDTOs(List<Product> products);
}
