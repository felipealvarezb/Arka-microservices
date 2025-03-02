package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.entities.Cart;
import com.felipe.arka.checkout.mappers.CartMapper;
import com.felipe.arka.checkout.repositories.CartRepository;
import com.felipe.arka.checkout.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

  private final CartRepository cartRepository;
  private final CartMapper cartMapper;

  @Override
  public List<CartResponseDTO> getAbandonedCarts() {
    List<Cart> carts = cartRepository.findAll();
    return cartMapper.cartsToCartResponseDTOs(carts);
  }

  @Override
  public CartResponseDTO createCart(Long userId) {
    Cart cart = new Cart();

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
