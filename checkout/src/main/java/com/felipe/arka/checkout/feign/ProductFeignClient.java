package com.felipe.arka.checkout.feign;

import com.felipe.arka.checkout.dtos.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "UserFeign", url = "http://localhost:8082")
public interface ProductFeignClient {

  @GetMapping("/api/v1/product/{productId}")
  public ResponseEntity<ProductDTO> getProductById(@PathVariable Long productId);
}
