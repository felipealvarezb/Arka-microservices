package com.felipe.arka.warehouse.repositories;

import com.felipe.arka.warehouse.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
