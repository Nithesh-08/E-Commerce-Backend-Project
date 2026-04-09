package com.E_Commerce_backend.project.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDTO {

    private Integer userId;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 50)
    private String userName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String userEmail;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String userPassword;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone must be 10 digits")
    private String userPhoneNo;
}
