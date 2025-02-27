package com.felipe.arka.customer.repository;

import com.felipe.arka.customer.entities.UserRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolRepository extends JpaRepository<UserRol, Long> {
}
