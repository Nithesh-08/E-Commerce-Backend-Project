package com.E_Commerce_backend.project.Controller;

import com.E_Commerce_backend.project.DTO.ProductDTO;
import com.E_Commerce_backend.project.Service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ProductDTO create(@Valid @RequestBody ProductDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<ProductDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductDTO get(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable Integer id,
                             @Valid @RequestBody ProductDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Deleted";
    }
}
