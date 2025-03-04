package com.felipe.arka.checkout.feign;


import com.felipe.arka.checkout.dtos.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "UserFeign", url = "http://localhost:8080")
public interface UserFeignClient {

  @GetMapping("/api/v1/user/{userId}")
  public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId);


}
