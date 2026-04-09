package com.E_Commerce_backend.project.Mapper;

import com.E_Commerce_backend.project.Entity.Orders;
import com.E_Commerce_backend.project.Entity.Product;
import com.E_Commerce_backend.project.DTO.OrderDTO;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMapper {

    public static OrderDTO toDTO(Orders order) {

        if (order == null) return null;

        OrderDTO dto = new OrderDTO();

        dto.setOrderId(order.getOrderId());

        if (order.getUser() != null) {
            dto.setUserId(order.getUser().getUserId());
        }

        if (order.getProducts() != null) {
            List<Integer> productIds = order.getProducts()
                    .stream()
                    .map(Product::getProductId)
                    .collect(Collectors.toList());

            dto.setProductIds(productIds);
        }

        dto.setProductQuantity(order.getProductQuantity());

        return dto;
    }

}