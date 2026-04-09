package com.E_Commerce_backend.project.Controller;

import com.E_Commerce_backend.project.DTO.AddressDTO;
import com.E_Commerce_backend.project.Service.AddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService service;

    @PostMapping
    public AddressDTO create(@Valid @RequestBody AddressDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<AddressDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AddressDTO get(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public AddressDTO update(@PathVariable Integer id,
                             @Valid @RequestBody AddressDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}