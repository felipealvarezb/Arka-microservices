package com.felipe.arka.warehouse.mappers.implementation;

import com.felipe.arka.warehouse.dtos.StockDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.StockResponseDTO;
import com.felipe.arka.warehouse.entities.Stock;
import com.felipe.arka.warehouse.mappers.StockMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockMapperImpl implements StockMapper {

  @Override
  public Stock stockDTOToStock(StockDTO stockDTO) {
    return null;
  }

  @Override
  public StockResponseDTO stockToStockResponseDTO(Stock stock) {
    return null;
  }

  @Override
  public List<StockResponseDTO> stocksToStockResponseDTOs(List<Stock> stocks) {
    return List.of();
  }
}
