package com.E_Commerce_backend.project.Repository;

import com.E_Commerce_backend.project.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositroy extends JpaRepository<Product,Integer> {
}
