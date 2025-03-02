package com.felipe.arka.customer.repository;

import com.felipe.arka.customer.entities.UserRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRolRepository extends JpaRepository<UserRol, Long> {

  boolean existsByUserIdAndRolId(Long userId, Long rolId);

  @Query("SELECT ur FROM UserRol ur WHERE ur.user.id = :userId AND ur.rol.id = :rolId")
  Optional<UserRol> findByUserIdAndRolId(Long userId, Long rolId);
}
