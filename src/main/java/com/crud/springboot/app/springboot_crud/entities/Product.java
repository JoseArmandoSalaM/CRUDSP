package com.crud.springboot.app.springboot_crud.entities;

import com.crud.springboot.app.springboot_crud.validation.IsExistsDb;
import com.crud.springboot.app.springboot_crud.validation.IsRequired;

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

    // ConValidation
    @NotEmpty(message = "{NotEmpty.product.name}")
    @Size(min = 3)
    private String name;

    // Personalizado
    @IsRequired
    @Column(name = "lastname")
    @Size(min = 3)
    private String lasname;

    @IsRequired
    @IsExistsDb
    private String sku;

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

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lastname) {
        this.lasname = lastname;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

}
