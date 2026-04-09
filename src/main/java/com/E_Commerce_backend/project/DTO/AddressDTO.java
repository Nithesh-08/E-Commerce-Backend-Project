package com.E_Commerce_backend.project.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AddressDTO {

    private Integer addressId;

    @NotBlank
    private String addressName;

    @NotBlank
    private String addressLandmark;

    @NotBlank
    private String addressState;

    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    private String addressPhoneNumber;

    @Pattern(regexp = "^[0-9]{6}$", message = "Zip must be 6 digits")
    private String addressZipCode;
    private Integer UserId;
}