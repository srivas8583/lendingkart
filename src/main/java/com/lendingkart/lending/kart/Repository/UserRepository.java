package com.lendingkart.lending.kart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendingkart.lending.kart.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

