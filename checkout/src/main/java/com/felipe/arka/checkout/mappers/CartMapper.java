package com.felipe.arka.checkout.mappers;

import com.felipe.arka.checkout.dtos.CartDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.entities.Cart;

import java.util.List;

public interface CartMapper {

  Cart cartDTOToCart(CartDTO cartDTO);

  CartResponseDTO cartToCartResponseDTO(Cart cart);

  List<CartResponseDTO> cartsToCartResponseDTOs(List<Cart> carts);
}
