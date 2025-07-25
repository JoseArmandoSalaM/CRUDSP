package com.crud.springboot.app.springboot_crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.springboot.app.springboot_crud.entities.Product;
import com.crud.springboot.app.springboot_crud.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;

    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {

        return (List<Product>) productRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(String id) {

        return productRepository.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {

        return productRepository.save(product);
    }

    @Transactional
    @Override
    public Optional<Product> update(String id, Product product) {
        Optional<Product> productDb = productRepository.findById(id);
        if (productDb.isPresent()) {
            Product p = productDb.get();
            p.setName(product.getName());
            p.setLastname(product.getLastname());
            return Optional.of(productRepository.save(p));
        }

        return productDb;
    }

    @Transactional
    @Override
    public Optional<Product> delete(String id) {
        Optional<Product> productDb = productRepository.findById(id);
        productDb.ifPresent(p -> {
            productRepository.delete(p);
        });
        return productDb;
    }

}
