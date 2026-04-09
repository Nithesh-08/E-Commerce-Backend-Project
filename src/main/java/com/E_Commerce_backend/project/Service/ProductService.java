package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO create(ProductDTO dto);
    List<ProductDTO> getAll();
    ProductDTO getById(Integer id);
    ProductDTO update(Integer id, ProductDTO dto);
    void delete(Integer id);
}
