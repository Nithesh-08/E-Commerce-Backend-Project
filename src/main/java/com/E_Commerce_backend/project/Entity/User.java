package com.E_Commerce_backend.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Entity@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userEmail;

    private String userPassword;

    private String userPhoneNo;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    private Address address;
}
