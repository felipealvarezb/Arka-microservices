package com.felipe.arka.warehouse.services.implementation;

import com.felipe.arka.warehouse.repositories.StockRepository;
import com.felipe.arka.warehouse.services.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

  private final StockRepository stockRepository;
}
