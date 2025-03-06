package com.felipe.arka.warehouse.mappers.implementation;

import com.felipe.arka.warehouse.dtos.CategoryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CategoryResponseDTO;
import com.felipe.arka.warehouse.entities.Category;
import com.felipe.arka.warehouse.mappers.CategoryMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryMapperImpl implements CategoryMapper {

  @Override
  public Category categoryDTOToCategory(CategoryDTO categoryDTO) {
    return null;
  }

  @Override
  public CategoryResponseDTO categoryToCategoryResponseDTO(Category category) {
    return null;
  }

  @Override
  public List<CategoryResponseDTO> categoriesToCategoryResponseDTOs(List<Category> categories) {
    return List.of();
  }
}
