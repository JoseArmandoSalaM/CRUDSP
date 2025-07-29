package com.crud.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crud.springboot.app.springboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

    boolean existsBySku(String sku);

}
