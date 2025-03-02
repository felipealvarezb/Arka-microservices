package com.felipe.arka.checkout.mappers.implementation;

import com.felipe.arka.checkout.dtos.CartDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.entities.Cart;
import com.felipe.arka.checkout.mappers.CartMapper;

import java.util.List;

public class CartMapperImpl implements CartMapper {
  @Override
  public Cart cartDTOToCart(CartDTO cartDTO) {
    return null;
  }

  @Override
  public CartResponseDTO cartToCartResponseDTO(Cart cart) {
    return null;
  }

  @Override
  public List<CartResponseDTO> cartsToCartResponseDTOs(List<Cart> carts) {
    return List.of();
  }
}
