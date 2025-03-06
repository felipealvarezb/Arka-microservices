package com.felipe.arka.warehouse.repositories;

import com.felipe.arka.warehouse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

  @Query("SELECT p FROM Product p WHERE p.productCategories.category.id = :categoryId")
  List<Product> findProductByCategoryId(Long categoryId);
}
