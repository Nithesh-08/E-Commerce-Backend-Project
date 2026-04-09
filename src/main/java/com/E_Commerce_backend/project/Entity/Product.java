package com.E_Commerce_backend.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Entity@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private String productDesc;
    @Enumerated(value = EnumType.STRING)
    private ProductCategory productCategory;
    private String productBrand;
}
