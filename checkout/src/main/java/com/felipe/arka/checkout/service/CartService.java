package com.felipe.arka.checkout.service;

import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;

import java.util.List;

public interface CartService {

  List<CartResponseDTO> getAbandonedCarts();

  CartResponseDTO getCartByUserId(Long userId);

  CartResponseDTO createCart(Long userId);

  CartResponseDTO insertItem(Long userId, Long productId);

  String deleteCartByUserId(Long userId);
}
