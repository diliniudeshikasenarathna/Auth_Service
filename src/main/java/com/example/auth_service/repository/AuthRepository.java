package com.example.auth_service.repository;

import com.example.auth_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<UserEntity , Long> {

}
