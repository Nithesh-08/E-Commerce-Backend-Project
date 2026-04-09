package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.OrderDTO;
import com.E_Commerce_backend.project.Entity.Orders;
import com.E_Commerce_backend.project.Entity.User;
import com.E_Commerce_backend.project.Exception.ResourceNotFoundException;
import com.E_Commerce_backend.project.Mapper.OrderMapper;
import com.E_Commerce_backend.project.Repository.OrderRepository;
import com.E_Commerce_backend.project.Repository.ProductRepositroy;
import com.E_Commerce_backend.project.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repo;
    private final UserRepository userRepo;
    private final ProductRepositroy productRepo;

    public OrderDTO create(OrderDTO dto) {

        Orders order = new Orders();

        User user = userRepo.findById(dto.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        order.setUser(user);

        order.setProducts(productRepo.findAllById(dto.getProductIds()));
        order.setProductQuantity(dto.getProductQuantity());

        return OrderMapper.toDTO(repo.save(order));
    }

    public List<OrderDTO> getAll() {
        return repo.findAll().stream()
                .map(OrderMapper::toDTO).toList();
    }

    public OrderDTO getById(Integer id) {
        Orders o = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        return OrderMapper.toDTO(o);
    }

    public void delete(Integer id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Order not found");

        repo.deleteById(id);
    }
}