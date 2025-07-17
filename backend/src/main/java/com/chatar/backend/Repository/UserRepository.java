package com.chatar.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatar.backend.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
    Users findByUsername(String username);
}
