package com.felipe.arka.warehouse.services.implementation;

import com.felipe.arka.warehouse.dtos.ProductDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.ProductResponseDTO;
import com.felipe.arka.warehouse.entities.Product;
import com.felipe.arka.warehouse.mappers.ProductMapper;
import com.felipe.arka.warehouse.repositories.ProductRepository;
import com.felipe.arka.warehouse.services.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  @Override
  public List<ProductResponseDTO> findProductsByCategory(Long categoryId) {
    List<Product> products = productRepository.findProductByCategoryId(categoryId);
    return productMapper.productsToProductResponseDTOs(products);
  }

  @Override
  public ProductResponseDTO getProductById(Long id) {
    Product existingProduct = productRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Product not found"));

    return productMapper.productToProductResponseDTO(existingProduct);
  }

  @Override
  public ProductResponseDTO createProduct(ProductDTO productDTO) {
    return null;
  }

  @Override
  public ProductResponseDTO assignCategory(Long productId, Long categoryId) {
    return null;
  }

  @Override
  public ProductResponseDTO unassignCategory(Long productId, Long categoryId) {
    return null;
  }

  @Override
  public ProductResponseDTO updateProduct(Long id, ProductDTO productDTO) {
    return null;
  }

  @Override
  public String deleteProduct(Long id) {
    return "";
  }
}
