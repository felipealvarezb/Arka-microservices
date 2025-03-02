package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.repositories.CartRepository;
import com.felipe.arka.checkout.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

  private final CartRepository cartRepository;

  @Override
  public List<CartResponseDTO> getAbandonedCarts() {
    return List.of();
  }

  @Override
  public CartResponseDTO createCart(Long userId) {
    return null;
  }

  @Override
  public CartResponseDTO insertItem(Long userId, Long productId) {
    return null;
  }

  @Override
  public CartResponseDTO getCartByUserId(Long userId) {
    return null;
  }

  @Override
  public String deleteCartByUserId(Long userId) {
    return "";
  }
}
