package com.felipe.arka.warehouse.services.implementation;

import com.felipe.arka.warehouse.repositories.CountryRepository;
import com.felipe.arka.warehouse.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

  private final CountryRepository countryRepository;
}
