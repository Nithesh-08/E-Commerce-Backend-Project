package com.E_Commerce_backend.project.Mapper;

import com.E_Commerce_backend.project.Entity.Product;
import com.E_Commerce_backend.project.DTO.ProductDTO;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {

        if (product == null) return null;

        ProductDTO dto = new ProductDTO();

        dto.setProductId(product.getProductId());
        dto.setProductName(product.getProductName());
        dto.setProductPrice(product.getProductPrice());
        dto.setProductDesc(product.getProductDesc());
        dto.setProductCategory(product.getProductCategory());
        dto.setProductBrand(product.getProductBrand());

        return dto;
    }

    public static Product toEntity(ProductDTO dto) {

        if (dto == null) return null;

        Product product = new Product();

        product.setProductId(dto.getProductId());
        product.setProductName(dto.getProductName());
        product.setProductPrice(dto.getProductPrice());
        product.setProductDesc(dto.getProductDesc());
        product.setProductCategory(dto.getProductCategory());
        product.setProductBrand(dto.getProductBrand());

        return product;
    }
}
