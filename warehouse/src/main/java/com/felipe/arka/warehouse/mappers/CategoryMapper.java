package com.felipe.arka.warehouse.mappers;

import com.felipe.arka.warehouse.dtos.CategoryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CategoryResponseDTO;
import com.felipe.arka.warehouse.entities.Category;

import java.util.List;

public interface CategoryMapper {

  Category categoryDTOToCategory(CategoryDTO categoryDTO);

  CategoryResponseDTO categoryToCategoryResponseDTO(Category category);

  List<CategoryResponseDTO> categoriesToCategoryResponseDTOs(List<Category> categories);

}
