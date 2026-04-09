package com.E_Commerce_backend.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;


    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

    @ManyToMany()
    @JoinTable(name = "fk_order_product_table",joinColumns = @JoinColumn(name = "fk_order_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_product_id"))
    private List<Product> products;

    @OneToOne()
    @JoinColumn(name = "fk_address_id")
    private Address address;
    private Integer productQuantity;


}
