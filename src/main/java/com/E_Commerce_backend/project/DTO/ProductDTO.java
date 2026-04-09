package com.E_Commerce_backend.project.DTO;

import com.E_Commerce_backend.project.Entity.ProductCategory;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProductDTO {

    private Integer productId;

    @NotBlank
    private String productName;

    @NotNull
    @Min(value = 1, message = "Price must be > 0")
    private Integer productPrice;

    @NotBlank
    private String productDesc;

    @NotNull
    private ProductCategory productCategory;

    @NotBlank
    private String productBrand;
}
