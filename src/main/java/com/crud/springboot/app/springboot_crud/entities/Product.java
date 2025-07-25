package com.crud.springboot.app.springboot_crud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Product {

    // ejemplo de validacion en un min
    // @Min(500, message = "{Min.product.price}")

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotEmpty(message = "{NotEmpty.product.name}")
    @Size(min = 3)
    private String name;

    @NotBlank(message = "{NotBlack.product.latname}")
    @Column(name = "lastname")
    @Size(min = 3)
    private String lasname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lasname;
    }

    public void setLastname(String lastname) {
        this.lasname = lastname;
    }

}
