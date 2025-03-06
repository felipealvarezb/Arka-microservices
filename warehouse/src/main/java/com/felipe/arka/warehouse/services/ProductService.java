package com.felipe.arka.warehouse.services;

import com.felipe.arka.warehouse.dtos.ProductDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.ProductResponseDTO;

import java.util.List;

public interface ProductService {

  List<ProductResponseDTO> findProductsByCategory(Long categoryId);

  ProductResponseDTO getProductById(Long id);

  ProductResponseDTO createProduct(ProductDTO productDTO);

  ProductResponseDTO assignCategory(Long productId, Long categoryId);

  ProductResponseDTO unassignCategory(Long productId, Long categoryId);

  ProductResponseDTO updateProduct(Long id, ProductDTO productDTO);

  String deleteProduct(Long id);
}
