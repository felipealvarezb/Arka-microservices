package com.felipe.arka.customer.dtos.responseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolResponseDTO {

  private String name;
  private String description;
  private Date createdAt;
  private Date updatedAt;

}
