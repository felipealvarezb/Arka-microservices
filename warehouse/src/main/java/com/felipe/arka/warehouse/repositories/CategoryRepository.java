package com.felipe.arka.warehouse.repositories;

import com.felipe.arka.warehouse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
