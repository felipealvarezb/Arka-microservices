package com.felipe.arka.checkout.service.implementation;

import com.felipe.arka.checkout.dtos.ProductDTO;
import com.felipe.arka.checkout.dtos.UserDTO;
import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.entities.Cart;
import com.felipe.arka.checkout.entities.CartDetail;
import com.felipe.arka.checkout.feign.ProductFeignClient;
import com.felipe.arka.checkout.feign.UserFeignClient;
import com.felipe.arka.checkout.mappers.CartMapper;
import com.felipe.arka.checkout.repositories.CartRepository;
import com.felipe.arka.checkout.service.CartService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

  private final CartRepository cartRepository;
  private final CartMapper cartMapper;
  private final UserFeignClient userFeignClient;
  private final ProductFeignClient productFeignClient;

  @Override
  public List<CartResponseDTO> getAbandonedCarts() {
    List<Cart> carts = cartRepository.findAll();
    return cartMapper.cartsToCartResponseDTOs(carts);
  }

  @Override
  public CartResponseDTO getCartByUserId(Long userId) {
    Cart userCart = cartRepository.findByUserId(userId)
            .orElseThrow(() -> new EntityNotFoundException("Cart not found"));

    return cartMapper.cartToCartResponseDTO(userCart);
  }

  @Override
  public CartResponseDTO createCart(Long userId) {
    UserDTO existingUser = userFeignClient.getUserById(userId).getBody();

    Cart cart = new Cart();
    cart.setStatus("Pending");
    cart.setUser(existingUser);
    cart.setCartDetails(new ArrayList<>());

    cartRepository.save(cart);

    return cartMapper.cartToCartResponseDTO(cart);

  }

  @Override
  public CartResponseDTO insertItem(Long userId, Long productId) {
    Cart userCart = cartRepository.findByUserId(userId)
            .orElseThrow(() -> new EntityNotFoundException("Cart not found"));

    ProductDTO existingProduct = productFeignClient.getProductById(productId).getBody();

    Optional<CartDetail> existingCartDetail = userCart.getCartDetails().stream()
            .filter(cd -> cd.getProduct().getId().equals(productId))
            .findFirst();

    if (existingCartDetail.isPresent()) {
      existingCartDetail.get().setQuantity(existingCartDetail.get().getQuantity() + 1);
    } else {
      CartDetail cartDetail = new CartDetail();
      cartDetail.setCart(userCart);
      cartDetail.setProduct(existingProduct);
      cartDetail.setQuantity(1);
      userCart.getCartDetails().add(cartDetail);
    }

    cartRepository.save(userCart);

    return cartMapper.cartToCartResponseDTO(userCart);

  }

  @Override
  public String deleteCartByUserId(Long userId) {
    return "";
  }
}
