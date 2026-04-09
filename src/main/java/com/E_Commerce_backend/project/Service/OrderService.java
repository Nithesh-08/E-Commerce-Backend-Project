package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO create(OrderDTO dto);
    List<OrderDTO> getAll();
    OrderDTO getById(Integer id);
    void delete(Integer id);
}
