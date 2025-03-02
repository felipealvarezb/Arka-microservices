package com.felipe.arka.checkout.service;

import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;

import java.util.List;

public interface CartService {

  List<CartResponseDTO> getAbandonedCarts();

  CartResponseDTO createCart(Long userId);

  CartResponseDTO insertItem(Long userId, Long productId);

  CartResponseDTO getCartByUserId(Long userId);

  String deleteCartByUserId(Long userId);
}
