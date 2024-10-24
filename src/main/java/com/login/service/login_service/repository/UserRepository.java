package com.login.service.login_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.service.login_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}