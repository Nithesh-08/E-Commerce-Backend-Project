package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.ProductDTO;
import com.E_Commerce_backend.project.Entity.Product;
import com.E_Commerce_backend.project.Exception.ResourceNotFoundException;
import com.E_Commerce_backend.project.Mapper.ProductMapper;
import com.E_Commerce_backend.project.Repository.ProductRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepositroy repo;

    public ProductDTO create(ProductDTO dto) {
        return ProductMapper.toDTO(repo.save(ProductMapper.toEntity(dto)));
    }

    public List<ProductDTO> getAll() {
        return repo.findAll().stream()
                .map(ProductMapper::toDTO).toList();
    }

    public ProductDTO getById(Integer id) {
        Product p = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        return ProductMapper.toDTO(p);
    }

    public ProductDTO update(Integer id, ProductDTO dto) {
        Product p = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        p.setProductName(dto.getProductName());
        p.setProductPrice(dto.getProductPrice());
        p.setProductDesc(dto.getProductDesc());
        p.setProductCategory(dto.getProductCategory());
        p.setProductBrand(dto.getProductBrand());

        return ProductMapper.toDTO(repo.save(p));
    }

    public void delete(Integer id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Product not found");

        repo.deleteById(id);
    }
}