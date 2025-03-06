package com.felipe.arka.warehouse.mappers;

import com.felipe.arka.warehouse.dtos.StockDTO;
import com.felipe.arka.warehouse.dtos.responseDTO.StockResponseDTO;
import com.felipe.arka.warehouse.entities.Stock;

import java.util.List;

public interface StockMapper {

  Stock stockDTOToStock(StockDTO stockDTO);

  StockResponseDTO stockToStockResponseDTO(Stock stock);

  List<StockResponseDTO> stocksToStockResponseDTOs(List<Stock> stocks);
}
