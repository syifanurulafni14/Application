package com.appl.services;

import java.util.Optional;

import com.appl.entity.Product;

public interface ProductService {
    Iterable<Product> findAll();
    void addProduct(Product product);
    void deleteById(long id);
    Optional<Product> findById(long id);
    void updateProduct(Product product);
}