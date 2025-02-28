package com.felipe.arka.customer.mappers;


import com.felipe.arka.customer.dtos.RolDTO;
import com.felipe.arka.customer.dtos.responseDTOs.RolResponseDTO;
import com.felipe.arka.customer.entities.Rol;

public interface RolMapper {

  Rol rolDtoToRol(RolDTO rolDTO);

  RolResponseDTO rolToRolResponseDTO(Rol rol);
}