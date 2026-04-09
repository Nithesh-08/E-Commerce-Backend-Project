package com.E_Commerce_backend.project.Controller;

import com.E_Commerce_backend.project.DTO.OrderDTO;
import com.E_Commerce_backend.project.Service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public OrderDTO create(@Valid @RequestBody OrderDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<OrderDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public OrderDTO get(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Deleted";
    }
}
