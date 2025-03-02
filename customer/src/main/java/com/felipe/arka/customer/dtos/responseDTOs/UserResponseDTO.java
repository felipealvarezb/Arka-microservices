package com.felipe.arka.customer.dtos.responseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

  private Long id;
  private String name;
  private String email;
  private String phone;
  private boolean active;
  private List<String> rolNames;
  private Date createdAt;
  private Date updatedAt;
}
