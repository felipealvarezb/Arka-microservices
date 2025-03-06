package com.felipe.arka.warehouse.mappers.implementation;

import com.felipe.arka.warehouse.dtos.CountryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CountryResponseDTO;
import com.felipe.arka.warehouse.entities.Country;
import com.felipe.arka.warehouse.mappers.CountryMapper;
import org.springframework.stereotype.Component;

@Component
public class CountryMapperImpl implements CountryMapper {
  @Override
  public Country countryDTOToCountry(CountryDTO countryDTO) {
    return null;
  }

  @Override
  public CountryResponseDTO countryToCountryResponseDTO(Country country) {
    return null;
  }
}
