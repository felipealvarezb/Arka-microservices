package com.felipe.arka.checkout.controllers;

import com.felipe.arka.checkout.dtos.responseDTOs.CartResponseDTO;
import com.felipe.arka.checkout.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
@RequiredArgsConstructor
public class CartController {

  private final CartService cartService;

  @GetMapping("/abandoned")
  public ResponseEntity<List<CartResponseDTO>> getAbandonedCarts() {
    List<CartResponseDTO> abandonedCarts = cartService.getAbandonedCarts();
    return ResponseEntity.ok().body(abandonedCarts);
  }

  @GetMapping("/user/{userId}")
  public ResponseEntity<CartResponseDTO> getCartByUserId(@PathVariable Long userId) {
    CartResponseDTO cart = cartService.getCartByUserId(userId);
    return ResponseEntity.ok().body(cart);
  }

  @PostMapping("/create/{userId}")
  public ResponseEntity<CartResponseDTO> create( @PathVariable Long userId){
    CartResponseDTO cart = cartService.createCart(userId);
    return ResponseEntity.ok().body(cart);
  }

  @PostMapping("/user/{userId}/product/{productId}")
  public ResponseEntity<CartResponseDTO> insertItem(@PathVariable Long userId, @PathVariable Long productId) {
    CartResponseDTO cart = cartService.insertItem(userId, productId);
    return ResponseEntity.ok().body(cart);
  }

  @DeleteMapping("/user/{userId}")
  public ResponseEntity<String> deleteCartByUserId(@PathVariable Long userId) {
    String message = cartService.deleteCartByUserId(userId);
    return ResponseEntity.ok().body(message);
  }
}
