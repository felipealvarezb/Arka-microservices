package com.felipe.arka.customer.mappers.implementation;


import com.felipe.arka.customer.dtos.RolDTO;
import com.felipe.arka.customer.dtos.responseDTOs.RolResponseDTO;
import com.felipe.arka.customer.entities.Rol;
import com.felipe.arka.customer.mappers.RolMapper;
import org.springframework.stereotype.Component;

@Component
public class RolMapperImpl implements RolMapper {

  @Override
  public Rol rolDtoToRol(RolDTO rolDTO) {
    Rol rol = new Rol();
    rol.setName(rolDTO.getName());
    rol.setDescription(rolDTO.getDescription());
    return rol;
  }

  @Override
  public RolResponseDTO rolToRolResponseDTO(Rol rol) {
    RolResponseDTO rolResponseDTO = new RolResponseDTO();
    rolResponseDTO.setName(rol.getName());
    rolResponseDTO.setDescription(rol.getDescription());
    rolResponseDTO.setCreatedAt(rol.getCreatedAt());
    rolResponseDTO.setUpdatedAt(rol.getUpdatedAt());
    return rolResponseDTO;
  }
}
