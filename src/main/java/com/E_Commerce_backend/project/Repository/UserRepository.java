package com.E_Commerce_backend.project.Repository;

import com.E_Commerce_backend.project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserEmail(String email);
}
