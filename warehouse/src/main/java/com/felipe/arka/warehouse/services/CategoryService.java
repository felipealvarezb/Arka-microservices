package com.felipe.arka.warehouse.services;

import com.felipe.arka.warehouse.dtos.CategoryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {

  List<CategoryResponseDTO> getAllCategories();

  CategoryResponseDTO createCategory(CategoryDTO categoryDTO);

  CategoryResponseDTO updateCategory(Long id, CategoryDTO categoryDTO);

  String deleteCategory(Long id);
}
