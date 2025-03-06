package com.felipe.arka.warehouse.services.implementation;

import com.felipe.arka.warehouse.dtos.CategoryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CategoryResponseDTO;
import com.felipe.arka.warehouse.repositories.CategoryRepository;
import com.felipe.arka.warehouse.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepository categoryRepository;

  @Override
  public List<CategoryResponseDTO> getAllCategories() {
    return List.of();
  }

  @Override
  public CategoryResponseDTO createCategory(CategoryDTO categoryDTO) {
    return null;
  }

  @Override
  public CategoryResponseDTO updateCategory(Long id, CategoryDTO categoryDTO) {
    return null;
  }

  @Override
  public String deleteCategory(Long id) {
    return "";
  }
}
