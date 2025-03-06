package com.felipe.arka.warehouse.mappers;

import com.felipe.arka.warehouse.dtos.CountryDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.CountryResponseDTO;
import com.felipe.arka.warehouse.entities.Country;

public interface CountryMapper {

  Country countryDTOToCountry(CountryDTO countryDTO);

  CountryResponseDTO countryToCountryResponseDTO(Country country);
}
