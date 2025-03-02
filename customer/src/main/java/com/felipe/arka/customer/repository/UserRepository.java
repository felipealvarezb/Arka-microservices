package com.felipe.arka.customer.repository;

import com.felipe.arka.customer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
