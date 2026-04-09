package com.E_Commerce_backend.project.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

    private Integer orderId;

    @NotNull
    private Integer userId;

    @NotEmpty(message = "Products cannot be empty")
    private List<Integer> productIds;

    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer productQuantity;
}