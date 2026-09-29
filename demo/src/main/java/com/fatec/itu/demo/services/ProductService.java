package com.fatec.itu.demo.services;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.fatec.itu.demo.entites.Product;
import com.fatec.itu.demo.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    private final ProductRepository repository;

    ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findById(Long id) {
        return repository.findById(id)
                         .orElseThrow(() -> new EntityNotFoundException());
    }

    public @Nullable Object findAll() {
        return repository.findAll();
    }
}
