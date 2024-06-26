package com.appl.repo;

import org.springframework.data.repository.CrudRepository;

import com.appl.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
}
