package com.E_Commerce_backend.project.Repository;

import com.E_Commerce_backend.project.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
}
