package com.felipe.arka.warehouse.repositories;

import com.felipe.arka.warehouse.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
