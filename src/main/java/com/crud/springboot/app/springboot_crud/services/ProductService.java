package com.crud.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.crud.springboot.app.springboot_crud.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(String id);

    Product save(Product product);

    Optional<Product> update(String id, Product product);

    Optional<Product> delete(String id);

}
