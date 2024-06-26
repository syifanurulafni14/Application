package com.appl.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.appl.entity.Product;
import com.appl.repo.ProductRepo;
import com.appl.utils.SystemCalendar;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo repo;
    
    @Override
    public Iterable<Product> findAll() {
        return repo.findAll();
    }

    @Override
    public void addProduct(Product product) {
        product.setCreate_tms(SystemCalendar.getSimpleDate());
        repo.save(product);
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Product> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void updateProduct(Product product) {
        product.setCreate_tms(SystemCalendar.getSimpleDate());
        repo.save(product);
    }
}
